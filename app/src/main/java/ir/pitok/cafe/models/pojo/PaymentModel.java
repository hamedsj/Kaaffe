package ir.pitok.cafe.models.pojo;

import com.google.gson.annotations.SerializedName;

import ir.pitok.cafe.models.pojo.dataModels.PaymentDataModel;

public class PaymentModel {

    @SerializedName("status")
    private int status;

    @SerializedName("data")
    private PaymentDataModel data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public PaymentDataModel getData() {
        return data;
    }

    public void setData(PaymentDataModel data) {
        this.data = data;
    }

}
