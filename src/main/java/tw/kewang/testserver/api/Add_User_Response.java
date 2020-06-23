package tw.kewang.testserver.api;

public class Add_User_Response {
    private int rsp_code;
    private String rsp_msg;

    public String getRsp_msg() {
        return rsp_msg;
    }

    public void setRsp_msg(String rsp_msg) {
        this.rsp_msg = rsp_msg;
    }

    public int getRsp_code() {
        return rsp_code;
    }

    public void setRsp_code(int rsp_code) {
        this.rsp_code = rsp_code;
    }
}
