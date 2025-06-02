package lk.ijse.my_last_only_last.Dto;

public class PrescriptionPageDto {
    private String prescriptionId;
    private String customerId;
    private String date;

    public PrescriptionPageDto() {}

    public PrescriptionPageDto(String prescriptionId, String customerId, String date) {
        this.prescriptionId = prescriptionId;
        this.customerId = customerId;
        this.date = date;
    }

    public String getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(String prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
