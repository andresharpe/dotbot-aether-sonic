package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.amazonaws.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public abstract class n implements I {

    /* renamed from: c, reason: collision with root package name */
    private static final int f23442c = 1024;

    /* renamed from: d, reason: collision with root package name */
    private static final int f23443d = 5;

    /* renamed from: e, reason: collision with root package name */
    private static final int f23444e = 1000;

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<MessageDigest> f23441b = new a();

    /* renamed from: a, reason: collision with root package name */
    public static final String f23440a = com.amazonaws.util.g.e(f(""));

    /* loaded from: classes.dex */
    static class a extends ThreadLocal<MessageDigest> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MessageDigest initialValue() {
            try {
                return MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException e4) {
                throw new AmazonClientException("Unable to get SHA256 Function" + e4.getMessage(), e4);
            }
        }
    }

    private static byte[] f(String str) {
        try {
            MessageDigest p4 = p();
            p4.update(str.getBytes(com.amazonaws.util.w.f24366b));
            return p4.digest();
        } catch (Exception e4) {
            throw new AmazonClientException("Unable to compute hash while signing request: " + e4.getMessage(), e4);
        }
    }

    private static MessageDigest p() {
        MessageDigest messageDigest = f23441b.get();
        messageDigest.reset();
        return messageDigest;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] A(byte[] bArr, byte[] bArr2, SigningAlgorithm signingAlgorithm) {
        try {
            Mac mac = Mac.getInstance(signingAlgorithm.toString());
            mac.init(new SecretKeySpec(bArr2, signingAlgorithm.toString()));
            return mac.doFinal(bArr);
        } catch (Exception e4) {
            throw new AmazonClientException("Unable to calculate a request signature: " + e4.getMessage(), e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String B(String str, String str2, SigningAlgorithm signingAlgorithm) {
        return C(str.getBytes(com.amazonaws.util.w.f24366b), str2, signingAlgorithm);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String C(byte[] bArr, String str, SigningAlgorithm signingAlgorithm) {
        try {
            return Base64.g(A(bArr, str.getBytes(com.amazonaws.util.w.f24366b), signingAlgorithm));
        } catch (Exception e4) {
            throw new AmazonClientException("Unable to calculate a request signature: " + e4.getMessage(), e4);
        }
    }

    protected abstract void e(com.amazonaws.f<?> fVar, m mVar);

    protected byte[] g(com.amazonaws.f<?> fVar) {
        if (com.amazonaws.util.n.k(fVar)) {
            String c4 = com.amazonaws.util.n.c(fVar);
            if (c4 == null) {
                return new byte[0];
            }
            return c4.getBytes(com.amazonaws.util.w.f24366b);
        }
        return j(fVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public InputStream h(com.amazonaws.f<?> fVar) {
        if (com.amazonaws.util.n.k(fVar)) {
            String c4 = com.amazonaws.util.n.c(fVar);
            if (c4 == null) {
                return new ByteArrayInputStream(new byte[0]);
            }
            return new ByteArrayInputStream(c4.getBytes(com.amazonaws.util.w.f24366b));
        }
        return i(fVar);
    }

    protected InputStream i(com.amazonaws.f<?> fVar) {
        try {
            InputStream content = fVar.getContent();
            if (content == null) {
                return new ByteArrayInputStream(new byte[0]);
            }
            if (content instanceof com.amazonaws.util.v) {
                return content;
            }
            if (content.markSupported()) {
                return fVar.getContent();
            }
            throw new AmazonClientException("Unable to read request payload to sign request.");
        } catch (Exception e4) {
            throw new AmazonClientException("Unable to read request payload to sign request: " + e4.getMessage(), e4);
        }
    }

    protected byte[] j(com.amazonaws.f<?> fVar) {
        InputStream i4 = i(fVar);
        try {
            i4.mark(-1);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[5120];
            while (true) {
                int read = i4.read(bArr);
                if (read == -1) {
                    byteArrayOutputStream.close();
                    i4.reset();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (Exception e4) {
            throw new AmazonClientException("Unable to read request payload to sign request: " + e4.getMessage(), e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String k(URI uri) {
        String n4 = com.amazonaws.util.w.n(uri.getHost());
        if (com.amazonaws.util.n.h(uri)) {
            return n4 + ":" + uri.getPort();
        }
        return n4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String l(com.amazonaws.f<?> fVar) {
        if (com.amazonaws.util.n.k(fVar)) {
            return "";
        }
        return m(fVar.e());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String m(Map<String, String> map) {
        TreeMap treeMap = new TreeMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            treeMap.put(com.amazonaws.util.n.j(entry.getKey(), false), com.amazonaws.util.n.j(entry.getValue(), false));
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = treeMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append((String) entry2.getKey());
            sb.append("=");
            sb.append((String) entry2.getValue());
            if (it.hasNext()) {
                sb.append("&");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String n(String str) {
        return o(str, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String o(String str, boolean z3) {
        if (str == null || str.length() == 0) {
            return "/";
        }
        if (z3) {
            str = com.amazonaws.util.n.j(str, true);
        }
        if (str.startsWith("/")) {
            return str;
        }
        return "/".concat(str);
    }

    protected String q(com.amazonaws.f<?> fVar) {
        return x(g(fVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String r(com.amazonaws.f<?> fVar) {
        return x(j(fVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Date s(int i4) {
        Date date = new Date();
        if (i4 != 0) {
            return new Date(date.getTime() - (i4 * 1000));
        }
        return date;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int t(com.amazonaws.f<?> fVar) {
        int j4 = fVar.j();
        if (com.amazonaws.i.a() != 0) {
            return com.amazonaws.i.a();
        }
        return j4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] u(InputStream inputStream) {
        try {
            com.amazonaws.internal.h hVar = new com.amazonaws.internal.h(inputStream, p());
            do {
            } while (hVar.read(new byte[1024]) > -1);
            return hVar.getMessageDigest().digest();
        } catch (Exception e4) {
            throw new AmazonClientException("Unable to compute hash while signing request: " + e4.getMessage(), e4);
        }
    }

    public byte[] v(String str) {
        return f(str);
    }

    public byte[] w(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Exception e4) {
            throw new AmazonClientException("Unable to compute hash while signing request: " + e4.getMessage(), e4);
        }
    }

    protected String x(byte[] bArr) {
        return new String(bArr, com.amazonaws.util.w.f24366b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public InterfaceC1029g y(InterfaceC1029g interfaceC1029g) {
        String a4;
        String c4;
        String str;
        synchronized (interfaceC1029g) {
            try {
                a4 = interfaceC1029g.a();
                c4 = interfaceC1029g.c();
                if (interfaceC1029g instanceof m) {
                    str = ((m) interfaceC1029g).b();
                } else {
                    str = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c4 != null) {
            c4 = c4.trim();
        }
        if (a4 != null) {
            a4 = a4.trim();
        }
        if (str != null) {
            str = str.trim();
        }
        if (interfaceC1029g instanceof m) {
            return new q(a4, c4, str);
        }
        return new p(a4, c4);
    }

    public byte[] z(String str, byte[] bArr, SigningAlgorithm signingAlgorithm) {
        try {
            return A(str.getBytes(com.amazonaws.util.w.f24366b), bArr, signingAlgorithm);
        } catch (Exception e4) {
            throw new AmazonClientException("Unable to calculate a request signature: " + e4.getMessage(), e4);
        }
    }
}
