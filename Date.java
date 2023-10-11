public class Date {
    private int data;
    private int luna;
    private int an;
    public Date(int data, int luna, int an){
        this.data = data;
        this.luna = luna;
        this.an = an;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        if (data>0 && data<=31){
            this.data = data;
        }
    }

    public int getLuna() {
        return luna;
    }

    public void setLuna(int luna) {
        if (luna>0 && luna<=12){
            this.luna = luna;
        }
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }
    public void displayDate(int data, int luna, int an){
        System.out.println(data + "/" + luna + "/" + an);
    }
}
