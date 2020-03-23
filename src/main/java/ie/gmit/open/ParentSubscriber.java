package ie.gmit.open;


// Created a parent class that contains common data
public abstract class ParentSubscriber {

    //Common
    protected Long subscriberId;
    protected String address;
    protected Long phoneNumber;
    protected int baseRate;

    public ParentSubscriber(Long subscriberId, String address, Long phoneNumber, int baseRate) {
        this.subscriberId = subscriberId;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.baseRate = baseRate;
    }


    public Long getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(Long subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(int baseRate) {
        this.baseRate = baseRate;
    }

    public abstract  double calculateBill(); // extensions(open for change)

}