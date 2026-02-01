package com.harman.jbl.partybox.ui.help.business;

import X2.q;
import android.content.Context;
import com.harman.jbl.partybox.ui.help.ui.h;
import com.harman.log.f;
import com.harman.sdk.utils.n;
import java.util.List;
import kotlin.H0;
import kotlin.Result;
import kotlin.W;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.U;
import kotlin.text.z;
import kotlinx.coroutines.flow.InterfaceC2283j;
import l3.d;
import l3.e;

@U({"SMAP\nBusiness.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Business.kt\ncom/harman/jbl/partybox/ui/help/business/Business\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,55:1\n47#2:56\n49#2:60\n50#3:57\n55#3:59\n106#4:58\n*S KotlinDebug\n*F\n+ 1 Business.kt\ncom/harman/jbl/partybox/ui/help/business/Business\n*L\n28#1:56\n28#1:60\n28#1:57\n28#1:59\n28#1:58\n*E\n"})
/* loaded from: classes2.dex */
public final class Business {

    /* renamed from: a, reason: collision with root package name */
    @d
    public static final Business f43795a = new Business();

    /* renamed from: b, reason: collision with root package name */
    @d
    private static final String f43796b = "Business";

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.help.business.Business", f = "Business.kt", i = {}, l = {32}, m = "getSupportDeviceFromRemote", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        /* synthetic */ Object f43803H;

        /* renamed from: J, reason: collision with root package name */
        int f43805J;

        a(c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object D(@d Object obj) {
            this.f43803H = obj;
            this.f43805J |= Integer.MIN_VALUE;
            return Business.this.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.help.business.Business$getSupportDeviceFromRemote$result$1$2", f = "Business.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class b extends SuspendLambda implements q<InterfaceC2283j<? super com.harman.jbl.partybox.ui.help.business.a>, Throwable, c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f43806I;

        /* renamed from: J, reason: collision with root package name */
        /* synthetic */ Object f43807J;

        b(c<? super b> cVar) {
            super(3, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object D(@d Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f43806I == 0) {
                W.n(obj);
                f.b(Business.f43796b, "getSupportDeviceFromRemote() >>> exception while parsing Json from remote:" + ((Throwable) this.f43807J));
                return H0.f51801a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // X2.q
        @e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object z(@d InterfaceC2283j<? super com.harman.jbl.partybox.ui.help.business.a> interfaceC2283j, @d Throwable th, @e c<? super H0> cVar) {
            b bVar = new b(cVar);
            bVar.f43807J = th;
            return bVar.D(H0.f51801a);
        }
    }

    private Business() {
    }

    @e
    public final List<h> a(@e Context context) {
        boolean S12;
        Object b4;
        String f4 = n.f(context, "AddNewProductConfig.json");
        if (f4 != null) {
            S12 = z.S1(f4);
            if (!S12) {
                try {
                    Result.a aVar = Result.f51807F;
                    b4 = Result.b((com.harman.jbl.partybox.ui.help.business.a) com.harman.sdk.utils.h.a().fromJson(f4, com.harman.jbl.partybox.ui.help.business.a.class));
                } catch (Throwable th) {
                    Result.a aVar2 = Result.f51807F;
                    b4 = Result.b(W.a(th));
                }
                if (Result.i(b4)) {
                    b4 = null;
                }
                com.harman.jbl.partybox.ui.help.business.a aVar3 = (com.harman.jbl.partybox.ui.help.business.a) b4;
                if (aVar3 == null) {
                    return null;
                }
                return aVar3.d();
            }
        }
        f.g(f43796b, "getSupportDeviceFromAsset() >>> empty config str from local assets.");
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(11:5|6|7|(1:(1:10)(2:26|27))(3:28|29|(1:31))|11|(1:13)(1:25)|14|15|(1:17)|18|(1:23)(2:20|21)))|34|6|7|(0)(0)|11|(0)(0)|14|15|(0)|18|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002c, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008b, code lost:
    
        r0 = kotlin.Result.f51807F;
        r8 = kotlin.Result.b(kotlin.W.a(r8));
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0080 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:10:0x0028, B:11:0x007c, B:13:0x0080, B:14:0x0086, B:29:0x004f), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@l3.d kotlin.coroutines.c<? super java.util.List<com.harman.jbl.partybox.ui.help.ui.h>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.harman.jbl.partybox.ui.help.business.Business.a
            if (r0 == 0) goto L13
            r0 = r8
            com.harman.jbl.partybox.ui.help.business.Business$a r0 = (com.harman.jbl.partybox.ui.help.business.Business.a) r0
            int r1 = r0.f43805J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f43805J = r1
            goto L18
        L13:
            com.harman.jbl.partybox.ui.help.business.Business$a r0 = new com.harman.jbl.partybox.ui.help.business.Business$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f43803H
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f43805J
            java.lang.String r3 = "Business"
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            kotlin.W.n(r8)     // Catch: java.lang.Throwable -> L2c
            goto L7c
        L2c:
            r8 = move-exception
            goto L8b
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L36:
            kotlin.W.n(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r2 = "getSupportDeviceFromRemote() >>> remoteLink:"
            r8.append(r2)
            java.lang.String r2 = "https://appstorage.onecloud.harman.com/jbl_partybox/app_config/support_device.json"
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            com.harman.log.f.d(r3, r8)
            kotlin.Result$a r8 = kotlin.Result.f51807F     // Catch: java.lang.Throwable -> L2c
            java.net.URL r8 = new java.net.URL     // Catch: java.lang.Throwable -> L2c
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L2c
            java.nio.charset.Charset r2 = kotlin.text.C2222d.f52792b     // Catch: java.lang.Throwable -> L2c
            byte[] r8 = kotlin.io.r.i(r8)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L2c
            r6.<init>(r8, r2)     // Catch: java.lang.Throwable -> L2c
            kotlinx.coroutines.flow.i r8 = kotlinx.coroutines.flow.C2284k.L0(r6)     // Catch: java.lang.Throwable -> L2c
            com.harman.jbl.partybox.ui.help.business.Business$getSupportDeviceFromRemote$lambda$1$$inlined$map$1 r2 = new com.harman.jbl.partybox.ui.help.business.Business$getSupportDeviceFromRemote$lambda$1$$inlined$map$1     // Catch: java.lang.Throwable -> L2c
            r2.<init>()     // Catch: java.lang.Throwable -> L2c
            com.harman.jbl.partybox.ui.help.business.Business$b r8 = new com.harman.jbl.partybox.ui.help.business.Business$b     // Catch: java.lang.Throwable -> L2c
            r8.<init>(r5)     // Catch: java.lang.Throwable -> L2c
            kotlinx.coroutines.flow.i r8 = kotlinx.coroutines.flow.C2284k.u(r2, r8)     // Catch: java.lang.Throwable -> L2c
            r0.f43805J = r4     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r8 = kotlinx.coroutines.flow.C2284k.w0(r8, r0)     // Catch: java.lang.Throwable -> L2c
            if (r8 != r1) goto L7c
            return r1
        L7c:
            com.harman.jbl.partybox.ui.help.business.a r8 = (com.harman.jbl.partybox.ui.help.business.a) r8     // Catch: java.lang.Throwable -> L2c
            if (r8 == 0) goto L85
            java.util.List r8 = r8.d()     // Catch: java.lang.Throwable -> L2c
            goto L86
        L85:
            r8 = r5
        L86:
            java.lang.Object r8 = kotlin.Result.b(r8)     // Catch: java.lang.Throwable -> L2c
            goto L95
        L8b:
            kotlin.Result$a r0 = kotlin.Result.f51807F
            java.lang.Object r8 = kotlin.W.a(r8)
            java.lang.Object r8 = kotlin.Result.b(r8)
        L95:
            java.lang.Throwable r0 = kotlin.Result.e(r8)
            if (r0 == 0) goto Laf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getSupportDeviceFromRemote() >>> exception while fetch from remote:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.harman.log.f.b(r3, r0)
        Laf:
            boolean r0 = kotlin.Result.i(r8)
            if (r0 == 0) goto Lb6
            goto Lb7
        Lb6:
            r5 = r8
        Lb7:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.help.business.Business.b(kotlin.coroutines.c):java.lang.Object");
    }
}
