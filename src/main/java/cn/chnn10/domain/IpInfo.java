package cn.chnn10.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class IpInfo implements Serializable {
    private static final long serialVersionUID = -4612222921661930429L;

    private String firstIp;

    private String firstRegion;

    private String latestIp;

    private String latestRegion;
}
