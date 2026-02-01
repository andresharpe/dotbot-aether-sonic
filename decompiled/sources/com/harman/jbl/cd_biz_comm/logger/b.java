package com.harman.jbl.cd_biz_comm.logger;

import X2.p;
import com.blankj.utilcode.util.E0;
import com.harman.jbl.cd_biz_comm.utils.f;
import java.io.File;
import java.util.concurrent.ArrayBlockingQueue;
import kotlin.H0;
import kotlin.Result;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.F;
import kotlinx.coroutines.C2319j;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V;
import l3.e;

/* loaded from: classes2.dex */
public final class b implements U {

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    public static final b f37854F;

    /* renamed from: G, reason: collision with root package name */
    @e
    private static c f37855G;

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private static final ArrayBlockingQueue<String> f37856H;

    /* renamed from: I, reason: collision with root package name */
    @e
    private static String f37857I;

    /* renamed from: E, reason: collision with root package name */
    private final /* synthetic */ U f37858E = V.a(C2322k0.c());

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.cd_biz_comm.logger.DebugHelperEx$1", f = "DebugHelperEx.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class a extends SuspendLambda implements p<U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f37859I;

        /* renamed from: J, reason: collision with root package name */
        private /* synthetic */ Object f37860J;

        a(kotlin.coroutines.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object D(@l3.d Object obj) {
            kotlin.coroutines.intrinsics.a.l();
            if (this.f37859I == 0) {
                W.n(obj);
                try {
                    Result.a aVar = Result.f51807F;
                    Result.b(H0.f51801a);
                } catch (Throwable th) {
                    Result.a aVar2 = Result.f51807F;
                    Result.b(W.a(th));
                }
                return H0.f51801a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // X2.p
        @e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d U u3, @e kotlin.coroutines.c<? super H0> cVar) {
            return ((a) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            a aVar = new a(cVar);
            aVar.f37860J = obj;
            return aVar;
        }
    }

    static {
        b bVar = new b();
        f37854F = bVar;
        f37856H = new ArrayBlockingQueue<>(1000, true);
        C2319j.e(bVar, null, null, new a(null), 3, null);
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        if (f37855G == null) {
            f37855G = e();
            return;
        }
        String o4 = f.o(System.currentTimeMillis());
        c cVar = f37855G;
        F.m(cVar);
        if (!F.g(o4, cVar.f())) {
            f37855G = e();
        }
    }

    private final c e() {
        File externalFilesDir = E0.a().getExternalFilesDir(null);
        F.m(externalFilesDir);
        File file = new File(externalFilesDir, f37857I);
        if (!file.exists()) {
            file.mkdirs();
        }
        String o4 = f.o(System.currentTimeMillis());
        File file2 = new File(file.getAbsolutePath(), o4 + ".txt");
        if (!file2.exists()) {
            file2.createNewFile();
        }
        F.m(o4);
        return new c(o4, file2);
    }

    public final void f(@l3.d String logDirName) {
        F.p(logDirName, "logDirName");
        f37857I = logDirName;
    }

    public final void g(@l3.d String content) {
        F.p(content, "content");
    }

    @Override // kotlinx.coroutines.U
    @l3.d
    public kotlin.coroutines.f getCoroutineContext() {
        return this.f37858E.getCoroutineContext();
    }
}
