package I2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.spotify.sdk.android.auth.LoginActivity;
import com.spotify.sdk.android.auth.d;
import com.spotify.sdk.android.auth.f;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    private static final int f1088c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static final String f1089d = "com.spotify.sso.action.START_AUTH_FLOW";

    /* renamed from: e, reason: collision with root package name */
    private static final String f1090e = "com.spotify.music";

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f1091f = {".debug", ".canary", ".partners", ""};

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f1092g = {"25a9b2d2745c098361edaa3b87936dc29a28e7f1", "80abdd17dcc4cb3a33815d354355bf87c9378624", "88df4d670ed5e01fc7b3eff13b63258628ff5a00", "d834ae340d1e854c5f4092722f9788216d9221e5", "1cbedd9e7345f64649bad2b493a20d9eea955352", "4b3d76a2de89033ea830f476a1f815692938e33b"};

    /* renamed from: h, reason: collision with root package name */
    private static final char[] f1093h = "0123456789abcdef".toCharArray();

    /* renamed from: a, reason: collision with root package name */
    private Activity f1094a;

    /* renamed from: b, reason: collision with root package name */
    private d f1095b;

    public b(Activity activity, d dVar) {
        this.f1094a = activity;
        this.f1095b = dVar;
    }

    private static String a(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i4 = 0; i4 < bArr.length; i4++) {
            byte b4 = bArr[i4];
            int i5 = i4 * 2;
            char[] cArr2 = f1093h;
            cArr[i5] = cArr2[(b4 & 255) >>> 4];
            cArr[i5 + 1] = cArr2[b4 & 15];
        }
        return new String(cArr);
    }

    private Intent b() {
        Intent intent = null;
        for (String str : f1091f) {
            intent = f(f1090e + str);
            if (intent != null) {
                break;
            }
        }
        return intent;
    }

    private static String c(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            byte[] bytes = str.getBytes("UTF-8");
            messageDigest.update(bytes, 0, bytes.length);
            return a(messageDigest.digest());
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    private Intent f(String str) {
        Intent intent = new Intent(f1089d);
        intent.setPackage(str);
        ComponentName resolveActivity = intent.resolveActivity(this.f1094a.getPackageManager());
        if (resolveActivity == null || !g(resolveActivity.getPackageName())) {
            return null;
        }
        return intent;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    private boolean g(String str) {
        Signature[] signatureArr;
        try {
            signatureArr = this.f1094a.getPackageManager().getPackageInfo(str, 64).signatures;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (signatureArr == null) {
            return false;
        }
        for (Signature signature : signatureArr) {
            String c4 = c(signature.toCharsString());
            for (String str2 : f1092g) {
                if (str2.equals(c4)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean d() {
        Intent b4 = b();
        if (b4 == null) {
            return false;
        }
        b4.putExtra(f.f49028i, 1);
        b4.putExtra(f.f49020a, this.f1095b.b());
        b4.putExtra(f.f49023d, this.f1095b.d());
        b4.putExtra(f.f49024e, this.f1095b.e());
        b4.putExtra(f.f49021b, this.f1095b.g());
        b4.putExtra(f.f49022c, this.f1095b.h());
        try {
            this.f1094a.startActivityForResult(b4, LoginActivity.f48952Q);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    public void e() {
        this.f1094a.finishActivity(LoginActivity.f48952Q);
    }
}
