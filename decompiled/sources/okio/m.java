package okio;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class m extends h {

    /* renamed from: F, reason: collision with root package name */
    private final MessageDigest f55366F;

    /* renamed from: G, reason: collision with root package name */
    private final Mac f55367G;

    private m(z zVar, String str) {
        super(zVar);
        try {
            this.f55366F = MessageDigest.getInstance(str);
            this.f55367G = null;
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    public static m c(z zVar, ByteString byteString) {
        return new m(zVar, byteString, "HmacSHA1");
    }

    public static m d(z zVar, ByteString byteString) {
        return new m(zVar, byteString, "HmacSHA256");
    }

    public static m f(z zVar) {
        return new m(zVar, "MD5");
    }

    public static m h(z zVar) {
        return new m(zVar, "SHA-1");
    }

    public static m i(z zVar) {
        return new m(zVar, "SHA-256");
    }

    @Override // okio.h, okio.z
    public long P0(C2385c c2385c, long j4) throws IOException {
        long P02 = super.P0(c2385c, j4);
        if (P02 != -1) {
            long j5 = c2385c.f55330F;
            long j6 = j5 - P02;
            v vVar = c2385c.f55329E;
            while (j5 > j6) {
                vVar = vVar.f55417g;
                j5 -= vVar.f55413c - vVar.f55412b;
            }
            while (j5 < c2385c.f55330F) {
                int i4 = (int) ((vVar.f55412b + j6) - j5);
                MessageDigest messageDigest = this.f55366F;
                if (messageDigest != null) {
                    messageDigest.update(vVar.f55411a, i4, vVar.f55413c - i4);
                } else {
                    this.f55367G.update(vVar.f55411a, i4, vVar.f55413c - i4);
                }
                j6 = (vVar.f55413c - vVar.f55412b) + j5;
                vVar = vVar.f55416f;
                j5 = j6;
            }
        }
        return P02;
    }

    public final ByteString b() {
        byte[] doFinal;
        MessageDigest messageDigest = this.f55366F;
        if (messageDigest != null) {
            doFinal = messageDigest.digest();
        } else {
            doFinal = this.f55367G.doFinal();
        }
        return ByteString.I(doFinal);
    }

    private m(z zVar, ByteString byteString, String str) {
        super(zVar);
        try {
            Mac mac = Mac.getInstance(str);
            this.f55367G = mac;
            mac.init(new SecretKeySpec(byteString.Z(), str));
            this.f55366F = null;
        } catch (InvalidKeyException e4) {
            throw new IllegalArgumentException(e4);
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }
}
