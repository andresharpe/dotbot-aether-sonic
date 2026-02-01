package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class B extends n implements I {

    /* renamed from: f, reason: collision with root package name */
    private Date f23371f;

    private String D(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        treeMap.putAll(map);
        for (Map.Entry entry : treeMap.entrySet()) {
            sb.append((String) entry.getKey());
            sb.append((String) entry.getValue());
        }
        return sb.toString();
    }

    private String E(com.amazonaws.f<?> fVar) {
        return "POST\n" + k(fVar.s()) + "\n" + F(fVar) + "\n" + m(fVar.e());
    }

    private String F(com.amazonaws.f<?> fVar) {
        String str = "";
        if (fVar.s().getPath() != null) {
            str = "" + fVar.s().getPath();
        }
        if (fVar.p() != null) {
            if (str.length() > 0 && !str.endsWith("/") && !fVar.p().startsWith("/")) {
                str = str + "/";
            }
            str = str + fVar.p();
        } else if (!str.endsWith("/")) {
            str = str + "/";
        }
        if (!str.startsWith("/")) {
            str = "/" + str;
        }
        if (str.startsWith("//")) {
            return str.substring(1);
        }
        return str;
    }

    private String G(int i4) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(com.amazonaws.util.k.f24329a);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date date = this.f23371f;
        if (date != null) {
            return simpleDateFormat.format(date);
        }
        return simpleDateFormat.format(s(i4));
    }

    void H(Date date) {
        this.f23371f = date;
    }

    public void I(com.amazonaws.f<?> fVar, SignatureVersion signatureVersion, SigningAlgorithm signingAlgorithm, InterfaceC1029g interfaceC1029g) {
        String E3;
        if (interfaceC1029g instanceof o) {
            return;
        }
        InterfaceC1029g y3 = y(interfaceC1029g);
        fVar.o("AWSAccessKeyId", y3.a());
        fVar.o("SignatureVersion", signatureVersion.toString());
        fVar.o("Timestamp", G(t(fVar)));
        if (y3 instanceof m) {
            e(fVar, (m) y3);
        }
        if (signatureVersion.equals(SignatureVersion.V1)) {
            E3 = D(fVar.e());
        } else if (signatureVersion.equals(SignatureVersion.V2)) {
            fVar.o("SignatureMethod", signingAlgorithm.toString());
            E3 = E(fVar);
        } else {
            throw new AmazonClientException("Invalid Signature Version specified");
        }
        fVar.o("Signature", B(E3, y3.c(), signingAlgorithm));
    }

    @Override // com.amazonaws.auth.I
    public void b(com.amazonaws.f<?> fVar, InterfaceC1029g interfaceC1029g) {
        I(fVar, SignatureVersion.V2, SigningAlgorithm.HmacSHA256, interfaceC1029g);
    }

    @Override // com.amazonaws.auth.n
    protected void e(com.amazonaws.f<?> fVar, m mVar) {
        fVar.o("SecurityToken", mVar.b());
    }
}
