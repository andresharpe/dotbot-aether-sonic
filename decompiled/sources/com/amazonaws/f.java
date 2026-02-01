package com.amazonaws;

import com.amazonaws.http.HttpMethodName;
import com.amazonaws.util.AWSRequestMetrics;
import java.io.InputStream;
import java.net.URI;
import java.util.Map;

/* loaded from: classes.dex */
public interface f<T> {
    Map<String, String> a();

    void addHeader(String str, String str2);

    String b();

    Map<String, String> e();

    void f(InputStream inputStream);

    AWSRequestMetrics g();

    InputStream getContent();

    void h(String str);

    void i(int i4);

    boolean isStreaming();

    int j();

    b k();

    HttpMethodName l();

    void m(boolean z3);

    void n(HttpMethodName httpMethodName);

    void o(String str, String str2);

    String p();

    void q(AWSRequestMetrics aWSRequestMetrics);

    void r(Map<String, String> map);

    URI s();

    f<T> t(String str, String str2);

    void u(Map<String, String> map);

    f<T> v(int i4);

    void w(URI uri);
}
