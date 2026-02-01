package androidx.core.view.inputmethod;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;
import androidx.core.util.p;
import androidx.core.util.u;
import androidx.core.view.C0807f;
import androidx.core.view.C0823k0;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13522a = "InputConnectionCompat";

    /* renamed from: b, reason: collision with root package name */
    private static final String f13523b = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";

    /* renamed from: c, reason: collision with root package name */
    private static final String f13524c = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";

    /* renamed from: d, reason: collision with root package name */
    private static final String f13525d = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";

    /* renamed from: e, reason: collision with root package name */
    private static final String f13526e = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";

    /* renamed from: f, reason: collision with root package name */
    private static final String f13527f = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";

    /* renamed from: g, reason: collision with root package name */
    private static final String f13528g = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";

    /* renamed from: h, reason: collision with root package name */
    private static final String f13529h = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";

    /* renamed from: i, reason: collision with root package name */
    private static final String f13530i = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";

    /* renamed from: j, reason: collision with root package name */
    private static final String f13531j = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";

    /* renamed from: k, reason: collision with root package name */
    private static final String f13532k = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";

    /* renamed from: l, reason: collision with root package name */
    private static final String f13533l = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";

    /* renamed from: m, reason: collision with root package name */
    private static final String f13534m = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";

    /* renamed from: n, reason: collision with root package name */
    private static final String f13535n = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";

    /* renamed from: o, reason: collision with root package name */
    private static final String f13536o = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";

    /* renamed from: p, reason: collision with root package name */
    public static final int f13537p = 1;

    /* renamed from: q, reason: collision with root package name */
    private static final String f13538q = "androidx.core.view.extra.INPUT_CONTENT_INFO";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends InputConnectionWrapper {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f13539a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InputConnection inputConnection, boolean z3, d dVar) {
            super(inputConnection, z3);
            this.f13539a = dVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i4, Bundle bundle) {
            if (this.f13539a.a(g.g(inputContentInfo), i4, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i4, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends InputConnectionWrapper {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f13540a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InputConnection inputConnection, boolean z3, d dVar) {
            super(inputConnection, z3);
            this.f13540a = dVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (f.f(str, bundle, this.f13540a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    @W(25)
    /* loaded from: classes.dex */
    static class c {
        private c() {
        }

        @InterfaceC0577u
        static boolean a(InputConnection inputConnection, InputContentInfo inputContentInfo, int i4, Bundle bundle) {
            return inputConnection.commitContent(inputContentInfo, i4, bundle);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        boolean a(@N g gVar, int i4, @P Bundle bundle);
    }

    @Deprecated
    public f() {
    }

    public static boolean b(@N InputConnection inputConnection, @N EditorInfo editorInfo, @N g gVar, int i4, @P Bundle bundle) {
        boolean z3;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (Build.VERSION.SDK_INT >= 25) {
            return c.a(inputConnection, androidx.core.view.inputmethod.d.a(gVar.f()), i4, bundle);
        }
        int e4 = androidx.core.view.inputmethod.c.e(editorInfo);
        if (e4 != 2) {
            z3 = false;
            if (e4 != 3 && e4 != 4) {
                return false;
            }
        } else {
            z3 = true;
        }
        Bundle bundle2 = new Bundle();
        if (z3) {
            str = f13526e;
        } else {
            str = f13525d;
        }
        bundle2.putParcelable(str, gVar.a());
        if (z3) {
            str2 = f13528g;
        } else {
            str2 = f13527f;
        }
        bundle2.putParcelable(str2, gVar.b());
        if (z3) {
            str3 = f13530i;
        } else {
            str3 = f13529h;
        }
        bundle2.putParcelable(str3, gVar.c());
        if (z3) {
            str4 = f13534m;
        } else {
            str4 = f13533l;
        }
        bundle2.putInt(str4, i4);
        if (z3) {
            str5 = f13532k;
        } else {
            str5 = f13531j;
        }
        bundle2.putParcelable(str5, bundle);
        if (z3) {
            str6 = f13524c;
        } else {
            str6 = f13523b;
        }
        return inputConnection.performPrivateCommand(str6, bundle2);
    }

    @N
    private static d c(@N final View view) {
        u.l(view);
        return new d() { // from class: androidx.core.view.inputmethod.e
            @Override // androidx.core.view.inputmethod.f.d
            public final boolean a(g gVar, int i4, Bundle bundle) {
                boolean g4;
                g4 = f.g(view, gVar, i4, bundle);
                return g4;
            }
        };
    }

    @N
    public static InputConnection d(@N View view, @N InputConnection inputConnection, @N EditorInfo editorInfo) {
        return e(inputConnection, editorInfo, c(view));
    }

    @N
    @Deprecated
    public static InputConnection e(@N InputConnection inputConnection, @N EditorInfo editorInfo, @N d dVar) {
        p.e(inputConnection, "inputConnection must be non-null");
        p.e(editorInfo, "editorInfo must be non-null");
        p.e(dVar, "onCommitContentListener must be non-null");
        if (Build.VERSION.SDK_INT >= 25) {
            return new a(inputConnection, false, dVar);
        }
        if (androidx.core.view.inputmethod.c.a(editorInfo).length == 0) {
            return inputConnection;
        }
        return new b(inputConnection, false, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    static boolean f(@P String str, @P Bundle bundle, @N d dVar) {
        boolean z3;
        String str2;
        ResultReceiver resultReceiver;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        ?? r02 = 0;
        r02 = 0;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals(f13523b, str)) {
            z3 = false;
        } else {
            if (!TextUtils.equals(f13524c, str)) {
                return false;
            }
            z3 = true;
        }
        if (z3) {
            str2 = f13536o;
        } else {
            str2 = f13535n;
        }
        try {
            ResultReceiver resultReceiver2 = (ResultReceiver) bundle.getParcelable(str2);
            if (z3) {
                str3 = f13526e;
            } else {
                str3 = f13525d;
            }
            try {
                Uri uri = (Uri) bundle.getParcelable(str3);
                if (z3) {
                    str4 = f13528g;
                } else {
                    str4 = f13527f;
                }
                ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(str4);
                if (z3) {
                    str5 = f13530i;
                } else {
                    str5 = f13529h;
                }
                Uri uri2 = (Uri) bundle.getParcelable(str5);
                if (z3) {
                    str6 = f13534m;
                } else {
                    str6 = f13533l;
                }
                int i4 = bundle.getInt(str6);
                if (z3) {
                    str7 = f13532k;
                } else {
                    str7 = f13531j;
                }
                Bundle bundle2 = (Bundle) bundle.getParcelable(str7);
                if (uri != null && clipDescription != null) {
                    r02 = dVar.a(new g(uri, clipDescription, uri2), i4, bundle2);
                }
                if (resultReceiver2 != 0) {
                    resultReceiver2.send(r02, null);
                }
                return r02;
            } catch (Throwable th) {
                th = th;
                resultReceiver = resultReceiver2;
                if (resultReceiver != null) {
                    resultReceiver.send(0, null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            resultReceiver = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean g(View view, g gVar, int i4, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i4 & 1) != 0) {
            try {
                gVar.e();
                InputContentInfo a4 = androidx.core.view.inputmethod.d.a(gVar.f());
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable(f13538q, a4);
            } catch (Exception e4) {
                Log.w(f13522a, "Can't insert content from IME; requestPermission() failed", e4);
                return false;
            }
        }
        if (C0823k0.m1(view, new C0807f.b(new ClipData(gVar.b(), new ClipData.Item(gVar.a())), 2).e(gVar.c()).c(bundle).a()) != null) {
            return false;
        }
        return true;
    }
}
