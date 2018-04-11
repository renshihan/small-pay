package com.renshihan.pay.frame.build;

import java.util.Map;

public interface IBuild {
    Map pay(Map<String, String> tranDataMap);
    Map query(Map<String, String> tranDataMap);
}
