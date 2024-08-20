package PARTII;

class RepeatedOrderThree extends OrderThree {
    private int period;
    private Date endDate;

    public RepeatedOrderThree(String customer, String product, Date date, int amount, int period, Date endDate) {
        super(customer, product, date, amount);
        this.period = period;
        this.endDate = endDate;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return super.toString() + " Period=" + period + " E=" + endDate.toString();
    }
}
