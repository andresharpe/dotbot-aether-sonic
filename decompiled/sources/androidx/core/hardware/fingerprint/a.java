package androidx.core.hardware.fingerprint;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;
import androidx.annotation.Y;
import androidx.core.os.C0742e;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

@Deprecated
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12565a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.hardware.fingerprint.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0088a extends FingerprintManager.AuthenticationCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f12566a;

        C0088a(c cVar) {
            this.f12566a = cVar;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationError(int i4, CharSequence charSequence) {
            this.f12566a.a(i4, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationFailed() {
            this.f12566a.b();
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationHelp(int i4, CharSequence charSequence) {
            this.f12566a.c(i4, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            this.f12566a.d(new d(a.f(b.b(authenticationResult))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(23)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @Y("android.permission.USE_FINGERPRINT")
        @InterfaceC0577u
        static void a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i4, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i4, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        @InterfaceC0577u
        static FingerprintManager.CryptoObject b(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        @InterfaceC0577u
        public static FingerprintManager c(Context context) {
            if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            return null;
        }

        @Y("android.permission.USE_FINGERPRINT")
        @InterfaceC0577u
        static boolean d(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        @Y("android.permission.USE_FINGERPRINT")
        @InterfaceC0577u
        static boolean e(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        @InterfaceC0577u
        public static e f(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new e(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new e(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() == null) {
                return null;
            }
            return new e(cryptoObject.getMac());
        }

        @InterfaceC0577u
        public static FingerprintManager.CryptoObject g(e eVar) {
            if (eVar == null) {
                return null;
            }
            if (eVar.a() != null) {
                return new FingerprintManager.CryptoObject(eVar.a());
            }
            if (eVar.c() != null) {
                return new FingerprintManager.CryptoObject(eVar.c());
            }
            if (eVar.b() == null) {
                return null;
            }
            return new FingerprintManager.CryptoObject(eVar.b());
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public void a(int i4, CharSequence charSequence) {
        }

        public void b() {
        }

        public void c(int i4, CharSequence charSequence) {
        }

        public void d(d dVar) {
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final e f12567a;

        public d(e eVar) {
            this.f12567a = eVar;
        }

        public e a() {
            return this.f12567a;
        }
    }

    private a(Context context) {
        this.f12565a = context;
    }

    @N
    public static a b(@N Context context) {
        return new a(context);
    }

    @P
    @W(23)
    private static FingerprintManager c(@N Context context) {
        return b.c(context);
    }

    @W(23)
    static e f(FingerprintManager.CryptoObject cryptoObject) {
        return b.f(cryptoObject);
    }

    @W(23)
    private static FingerprintManager.AuthenticationCallback g(c cVar) {
        return new C0088a(cVar);
    }

    @W(23)
    private static FingerprintManager.CryptoObject h(e eVar) {
        return b.g(eVar);
    }

    @Y("android.permission.USE_FINGERPRINT")
    public void a(@P e eVar, int i4, @P C0742e c0742e, @N c cVar, @P Handler handler) {
        CancellationSignal cancellationSignal;
        FingerprintManager c4 = c(this.f12565a);
        if (c4 != null) {
            if (c0742e != null) {
                cancellationSignal = (CancellationSignal) c0742e.b();
            } else {
                cancellationSignal = null;
            }
            b.a(c4, h(eVar), cancellationSignal, i4, g(cVar), handler);
        }
    }

    @Y("android.permission.USE_FINGERPRINT")
    public boolean d() {
        FingerprintManager c4 = c(this.f12565a);
        if (c4 != null && b.d(c4)) {
            return true;
        }
        return false;
    }

    @Y("android.permission.USE_FINGERPRINT")
    public boolean e() {
        FingerprintManager c4 = c(this.f12565a);
        if (c4 != null && b.e(c4)) {
            return true;
        }
        return false;
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        private final Signature f12568a;

        /* renamed from: b, reason: collision with root package name */
        private final Cipher f12569b;

        /* renamed from: c, reason: collision with root package name */
        private final Mac f12570c;

        public e(@N Signature signature) {
            this.f12568a = signature;
            this.f12569b = null;
            this.f12570c = null;
        }

        @P
        public Cipher a() {
            return this.f12569b;
        }

        @P
        public Mac b() {
            return this.f12570c;
        }

        @P
        public Signature c() {
            return this.f12568a;
        }

        public e(@N Cipher cipher) {
            this.f12569b = cipher;
            this.f12568a = null;
            this.f12570c = null;
        }

        public e(@N Mac mac) {
            this.f12570c = mac;
            this.f12569b = null;
            this.f12568a = null;
        }
    }
}
