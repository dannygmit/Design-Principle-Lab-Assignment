package ie.gmit.open;
import java.util.List;

// Open for change but close for modifications

public abstract class ISPSubscriber extends ParentSubscriber {

    private long freeUsage;


    public ISPSubscriber(Long subscriberId, String address, Long phoneNumber, int baseRate) {
        super(subscriberId, address, phoneNumber, baseRate);
    }

    public double calculateBill() {
        List<InternetSessionHistory.InternetSession> sessions = InternetSessionHistory.getCurrentSessions(subscriberId);
        long totalData = sessions.stream().mapToLong(InternetSessionHistory.InternetSession::getDataUsed).sum();
        long chargeableData = totalData - freeUsage;
        return chargeableData*baseRate/100;
    }




    public long getFreeUsage() {
        return freeUsage;
    }

    public void setFreeUsage(long freeUsage) {
        this.freeUsage = freeUsage;
    }

}