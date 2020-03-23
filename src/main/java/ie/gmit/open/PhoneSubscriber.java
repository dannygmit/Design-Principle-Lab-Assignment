package ie.gmit.open;

import java.util.List;

// Open for change but close for modifications

public abstract class PhoneSubscriber extends ParentSubscriber{

    public PhoneSubscriber(Long subscriberId, String address, Long phoneNumber, int baseRate) {
        super(subscriberId, address, phoneNumber, baseRate);
    }


    public double calculateBill() {
        List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(subscriberId);
        long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
        return totalDuration*baseRate/100;
    }

}