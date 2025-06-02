package lk.ijse.my_last_only_last.Dto;

public class MedicineDtoAdd {
    private String brandName;
    private String medicineName;
    private String storeType;
    private String dosage;
    private String price;
    private String expireDate;

    public MedicineDtoAdd(String brandName, String medicineName, String storeType, String dosage, String price, String expireDate) {
        this.brandName = brandName;
        this.medicineName = medicineName;
        this.storeType = storeType;
        this.dosage = dosage;
        this.price = price;
        this.expireDate = expireDate;
    }

    // Getters and setters
    public String getBrandName() { return brandName; }
    public String getMedicineName() { return medicineName; }
    public String getStoreType() { return storeType; }
    public String getDosage() { return dosage; }
    public String getPrice() { return price; }
    public String getExpireDate() { return expireDate; }
}
