package okio;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.Nullable;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class l extends g {

    /* renamed from: F, reason: collision with root package name */
    @Nullable
    private final MessageDigest f55364F;

    /* renamed from: G, reason: collision with root package name */
    @Nullable
    private final Mac f55365G;

    private l(y yVar, String str) {
        super(yVar);
        try {
            this.f55364F = MessageDigest.getInstance(str);
            this.f55365G = null;
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    public static l c(y yVar, ByteString byteString) {
        return new l(yVar, byteString, "HmacSHA1");
    }

    public static l d(y yVar, ByteString byteString) {
        return new l(yVar, byteString, "HmacSHA256");
    }

    public static l f(y yVar, ByteString byteString) {
        return new l(yVar, byteString, "HmacSHA512");
    }

    public static l h(y yVar) {
        return new l(yVar, "MD5");
    }

    public static l i(y yVar) {
        return new l(yVar, "SHA-1");
    }

    public static l j(y yVar) {
        return new l(yVar, "SHA-256");
    }

    public static l k(y yVar) {
        return new l(yVar, "SHA-512");
    }

    public final ByteString b() {
        byte[] doFinal;
        MessageDigest messageDigest = this.f55364F;
        if (messageDigest != null) {
            doFinal = messageDigest.digest();
        } else {
            doFinal = this.f55365G.doFinal();
        }
        return ByteString.I(doFinal);
    }

    @Override // okio.g, okio.y
    public void n0(C2385c c2385c, long j4) throws IOException {
        C.b(c2385c.f55330F, 0L, j4);
        v vVar = c2385c.f55329E;
        long j5 = 0;
        while (j5 < j4) {
            int min = (int) Math.min(j4 - j5, vVar.f55413c - vVar.f55412b);
            MessageDigest messageDigest = this.f55364F;
            if (messageDigest != null) {
                messageDigest.update(vVar.f55411a, vVar.f55412b, min);
            } else {
                this.f55365G.update(vVar.f55411a, vVar.f55412b, min);
            }
            j5 += min;
            vVar = vVar.f55416f;
        }
        super.n0(c2385c, j4);
    }

    private l(y yVar, ByteString byteString, String str) {
        super(yVar);
        try {
            Mac mac = Mac.getInstance(str);
            this.f55365G = mac;
            mac.init(new SecretKeySpec(byteString.Z(), str));
            this.f55364F = null;
        } catch (InvalidKeyException e4) {
            throw new IllegalArgumentException(e4);
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }
}
