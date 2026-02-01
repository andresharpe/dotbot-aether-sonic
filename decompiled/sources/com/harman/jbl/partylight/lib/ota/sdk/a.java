package com.harman.jbl.partylight.lib.ota.sdk;

import X2.p;
import com.blankj.utilcode.util.E0;
import com.blankj.utilcode.util.G;
import com.blankj.utilcode.util.J;
import com.harman.jbl.cd_biz_comm.utils.m;
import com.harman.jbl.partylight.lib.ota.sdk.j;
import java.io.File;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.A;
import kotlin.C;
import kotlin.H0;
import kotlin.Result;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.r;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C2222d;
import kotlin.text.z;
import kotlinx.coroutines.C2319j;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.w1;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private static final String f47295b = "BleOtaChecker";

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private static final A f47298e;

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final a f47294a = new a();

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private static String f47296c = com.harman.jbl.partybox.f.f40396k;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private static final Map<String, j.a> f47297d = new LinkedHashMap();

    /* renamed from: com.harman.jbl.partylight.lib.ota.sdk.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static final class C0419a extends Lambda implements X2.a<String> {

        /* renamed from: F, reason: collision with root package name */
        public static final C0419a f47299F = new C0419a();

        C0419a() {
            super(0);
        }

        @Override // X2.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final String n() {
            String absolutePath = E0.a().getFilesDir().getAbsolutePath();
            String str = File.separator;
            File file = new File(absolutePath + str + "Firmware" + str);
            file.mkdirs();
            return file.getAbsolutePath();
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.ota.sdk.BleOtaChecker$checkOtaInfo$2", f = "BleOtaChecker.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class b extends SuspendLambda implements p<U, kotlin.coroutines.c<? super j.a>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f47300I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ String f47301J;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.ota.sdk.BleOtaChecker$checkOtaInfo$2$1$ret$1", f = "BleOtaChecker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.harman.jbl.partylight.lib.ota.sdk.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0420a extends SuspendLambda implements p<U, kotlin.coroutines.c<? super j.a>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f47302I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ String f47303J;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0420a(String str, kotlin.coroutines.c<? super C0420a> cVar) {
                super(2, cVar);
                this.f47303J = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f47302I == 0) {
                    W.n(obj);
                    return ((j) J.h(new String(r.i(new URL(a.f47294a.h() + this.f47303J + "/ota_config.json")), C2222d.f52792b), j.class)).g();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // X2.p
            @l3.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super j.a> cVar) {
                return ((C0420a) v(u3, cVar)).D(H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                return new C0420a(this.f47303J, cVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, kotlin.coroutines.c<? super b> cVar) {
            super(2, cVar);
            this.f47301J = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            Object b4;
            j.a aVar;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f47300I;
            try {
                if (i4 != 0) {
                    if (i4 == 1) {
                        W.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    W.n(obj);
                    String str = this.f47301J;
                    Result.a aVar2 = Result.f51807F;
                    C0420a c0420a = new C0420a(str, null);
                    this.f47300I = 1;
                    obj = w1.e(10000L, c0420a, this);
                    if (obj == l4) {
                        return l4;
                    }
                }
                aVar = (j.a) obj;
            } catch (Throwable th) {
                Result.a aVar3 = Result.f51807F;
                b4 = Result.b(W.a(th));
            }
            if (aVar != null) {
                b4 = Result.b(aVar);
                String str2 = this.f47301J;
                if (Result.j(b4)) {
                    a.f47297d.put(str2, (j.a) b4);
                }
                String str3 = this.f47301J;
                Throwable e4 = Result.e(b4);
                if (e4 != null) {
                    com.harman.jbl.cd_biz_comm.logger.d.b(a.f47295b, "checking failed " + str3 + " " + e4);
                }
                if (Result.i(b4)) {
                    return null;
                }
                return b4;
            }
            throw new RuntimeException("firmware is null");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super j.a> cVar) {
            return ((b) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new b(this.f47301J, cVar);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.ota.sdk.BleOtaChecker$downloadFirmware$2", f = "BleOtaChecker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class c extends SuspendLambda implements p<U, kotlin.coroutines.c<? super String>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f47304I;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ String f47306K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, kotlin.coroutines.c<? super c> cVar) {
            super(2, cVar);
            this.f47306K = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f47304I == 0) {
                W.n(obj);
                a aVar = a.this;
                String str = this.f47306K;
                synchronized (aVar) {
                    Object obj2 = null;
                    try {
                        Result.a aVar2 = Result.f51807F;
                        Object obj3 = a.f47297d.get(str);
                        F.m(obj3);
                        j.a aVar3 = (j.a) obj3;
                        String str2 = aVar3.j() + "_" + aVar3.m() + ".bin";
                        a aVar4 = a.f47294a;
                        String str3 = aVar4.g() + str2;
                        if (G.h0(str3)) {
                            if (aVar4.d(str3, aVar3.j())) {
                                return str3;
                            }
                            G.p(str3);
                        }
                        boolean a4 = new h().a(aVar4.h() + str + "/" + aVar3.i(), str3);
                        StringBuilder sb = new StringBuilder();
                        sb.append("downloadFirmwareVersionFile result = ");
                        sb.append(a4);
                        com.harman.jbl.cd_biz_comm.logger.d.b(a.f47295b, sb.toString());
                        if (a4) {
                            boolean d4 = aVar4.d(str3, aVar3.j());
                            com.harman.jbl.cd_biz_comm.logger.d.b(a.f47295b, "checkMD5 failed pid = " + str + " md5Ret = " + d4);
                            if (d4) {
                                return str3;
                            }
                            G.p(str3);
                        }
                        return null;
                    } catch (Throwable th) {
                        Result.a aVar5 = Result.f51807F;
                        Object b4 = Result.b(W.a(th));
                        if (!Result.i(b4)) {
                            obj2 = b4;
                        }
                        return (String) obj2;
                    }
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super String> cVar) {
            return ((c) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new c(this.f47306K, cVar);
        }
    }

    static {
        A a4;
        a4 = C.a(C0419a.f47299F);
        f47298e = a4;
    }

    private a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d(String str, String str2) {
        boolean K12;
        K12 = z.K1(m.a(str), str2, true);
        return K12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String g() {
        return (String) f47298e.getValue();
    }

    @l3.e
    public final Object e(@l3.d String str, @l3.d kotlin.coroutines.c<? super j.a> cVar) {
        Map<String, j.a> map = f47297d;
        if (map.containsKey(str)) {
            j.a aVar = map.get(str);
            F.m(aVar);
            return aVar;
        }
        return C2319j.h(C2322k0.c(), new b(str, null), cVar);
    }

    @l3.e
    public final Object f(@l3.d String str, @l3.d kotlin.coroutines.c<? super String> cVar) {
        if (!f47297d.containsKey(str)) {
            return null;
        }
        return C2319j.h(C2322k0.c(), new c(str, null), cVar);
    }

    @l3.d
    public final String h() {
        return f47296c;
    }

    public final void i(@l3.d String str) {
        F.p(str, "<set-?>");
        f47296c = str;
    }
}
