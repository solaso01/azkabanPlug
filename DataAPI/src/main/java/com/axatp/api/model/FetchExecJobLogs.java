package com.axatp.api.model;

/**
 * 查询执行Job的日志
 */
public class FetchExecJobLogs extends BaseResponse {
    private String data;
    private Integer offset;
    private Integer length;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "FetchExecJobLogs{" +
                "data='" + data + '\'' +
                ", offset=" + offset +
                ", length=" + length +
                '}';
    }
}
