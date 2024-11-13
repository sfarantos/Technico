package org.example;

import java.sql.Date;

public class Repair {
    private String repairId;
    private Date repairDate;
    private String status; // "Pending", "In Progress", "Complete"
    private String repairType;
    private double repairCost;
    private String repairAddress;
    private String ownerVatNumber;


    public Repair(String repairId, Date repairDate, String status, String repairType, double repairCost, String repairAddress, String ownerVatNumber) {
        this.repairId = repairId;
        this.repairDate = repairDate;
        this.status = status;
        this.repairType = repairType;
        this.repairCost = repairCost;
        this.repairAddress = repairAddress;
        this.ownerVatNumber = ownerVatNumber;
    }


    public String getRepairId() { return repairId; }
    public void setRepairId(String repairId) { this.repairId = repairId; }

    public Date getRepairDate() { return repairDate; }
    public void setRepairDate(Date repairDate) { this.repairDate = repairDate; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getRepairType() { return repairType; }
    public void setRepairType(String repairType) { this.repairType = repairType; }

    public double getRepairCost() { return repairCost; }
    public void setRepairCost(double repairCost) { this.repairCost = repairCost; }

    public String getRepairAddress() { return repairAddress; }
    public void setRepairAddress(String repairAddress) { this.repairAddress = repairAddress; }

    public String getOwnerVatNumber() { return ownerVatNumber; }
    public void setOwnerVatNumber(String ownerVatNumber) { this.ownerVatNumber = ownerVatNumber; }











}