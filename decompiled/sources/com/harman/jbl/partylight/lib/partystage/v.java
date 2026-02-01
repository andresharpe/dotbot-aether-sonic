package com.harman.jbl.partylight.lib.partystage;

import com.harman.jbl.cd_biz_comm.wireless_tech.type.SpeakerDevice;
import com.harman.sdk.message.GestureInfo;
import com.spotify.sdk.android.auth.LoginActivity;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.U;

@U({"SMAP\nStickStageHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StickStageHelper.kt\ncom/harman/jbl/partylight/lib/partystage/StickStageHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,202:1\n1855#2,2:203\n*S KotlinDebug\n*F\n+ 1 StickStageHelper.kt\ncom/harman/jbl/partylight/lib/partystage/StickStageHelper\n*L\n157#1:203,2\n*E\n"})
/* loaded from: classes2.dex */
public final class v {

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private static final String f47483b = "StageHelper";

    /* renamed from: c, reason: collision with root package name */
    private static final long f47484c = 6000;

    /* renamed from: d, reason: collision with root package name */
    public static final int f47485d = 4;

    /* renamed from: e, reason: collision with root package name */
    @l3.e
    private static com.harman.jbl.partylight.lib.d f47486e;

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final v f47482a = new v();

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    private static final Map<String, H0> f47487f = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.partystage.StickStageHelper", f = "StickStageHelper.kt", i = {0, 0, 0, 1}, l = {GestureInfo.f48264x0, 171, com.harman.analytics.deviceAws.a.f37830m}, m = "applyStageNumToMainSpeaker", n = {"this", "speaker", "number", "speaker"}, s = {"L$0", "L$1", "I$0", "L$0"})
    /* loaded from: classes2.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f47488H;

        /* renamed from: I, reason: collision with root package name */
        Object f47489I;

        /* renamed from: J, reason: collision with root package name */
        int f47490J;

        /* renamed from: K, reason: collision with root package name */
        /* synthetic */ Object f47491K;

        /* renamed from: M, reason: collision with root package name */
        int f47493M;

        a(kotlin.coroutines.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f47491K = obj;
            this.f47493M |= Integer.MIN_VALUE;
            return v.this.c(0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.partystage.StickStageHelper", f = "StickStageHelper.kt", i = {}, l = {121}, m = "cancelStage", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class b extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        /* synthetic */ Object f47494H;

        /* renamed from: J, reason: collision with root package name */
        int f47496J;

        b(kotlin.coroutines.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f47494H = obj;
            this.f47496J |= Integer.MIN_VALUE;
            return v.this.d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.partystage.StickStageHelper", f = "StickStageHelper.kt", i = {0, 0, 1, 1, 2, 3, 4}, l = {68, 71, 75, 88, 93}, m = "enableStage", n = {"this", "mainSpeaker", "this", "mainSpeaker", "mainSpeaker", "mainSpeaker", "mainSpeaker"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$0"})
    /* loaded from: classes2.dex */
    public static final class c extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f47497H;

        /* renamed from: I, reason: collision with root package name */
        Object f47498I;

        /* renamed from: J, reason: collision with root package name */
        /* synthetic */ Object f47499J;

        /* renamed from: L, reason: collision with root package name */
        int f47501L;

        c(kotlin.coroutines.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f47499J = obj;
            this.f47501L |= Integer.MIN_VALUE;
            return v.this.f(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.partystage.StickStageHelper", f = "StickStageHelper.kt", i = {0, 1, 2}, l = {129, 132, 133, 144}, m = "saveStage", n = {"this", "this", "this"}, s = {"L$0", "L$0", "L$0"})
    /* loaded from: classes2.dex */
    public static final class d extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f47502H;

        /* renamed from: I, reason: collision with root package name */
        /* synthetic */ Object f47503I;

        /* renamed from: K, reason: collision with root package name */
        int f47505K;

        d(kotlin.coroutines.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f47503I = obj;
            this.f47505K |= Integer.MIN_VALUE;
            return v.this.h(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.partystage.StickStageHelper", f = "StickStageHelper.kt", i = {}, l = {111}, m = "startStage", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class e extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        /* synthetic */ Object f47506H;

        /* renamed from: J, reason: collision with root package name */
        int f47508J;

        e(kotlin.coroutines.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f47506H = obj;
            this.f47508J |= Integer.MIN_VALUE;
            return v.this.j(0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.partystage.StickStageHelper", f = "StickStageHelper.kt", i = {0, 0}, l = {185}, m = "writeDataToSpeakerByOuter", n = {LoginActivity.f48950O, "dev"}, s = {"L$0", "L$1"})
    /* loaded from: classes2.dex */
    public static final class f<R> extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f47509H;

        /* renamed from: I, reason: collision with root package name */
        Object f47510I;

        /* renamed from: J, reason: collision with root package name */
        /* synthetic */ Object f47511J;

        /* renamed from: L, reason: collision with root package name */
        int f47513L;

        f(kotlin.coroutines.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f47511J = obj;
            this.f47513L |= Integer.MIN_VALUE;
            return v.this.k(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.partystage.StickStageHelper$writeDataToSpeakerByOuter$ret$1", f = "StickStageHelper.kt", i = {}, l = {187}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class g extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super byte[]>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f47514I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g<R> f47515J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ SpeakerDevice f47516K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g<R> gVar, SpeakerDevice speakerDevice, kotlin.coroutines.c<? super g> cVar) {
            super(2, cVar);
            this.f47515J = gVar;
            this.f47516K = speakerDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f47514I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                com.harman.jbl.cd_biz_comm.logger.d.a(v.f47483b, "write data to outer speaker request = " + this.f47515J.e() + " " + this.f47516K);
                com.harman.jbl.partylight.lib.d g4 = v.f47482a.g();
                if (g4 != null) {
                    byte[] g5 = this.f47515J.g();
                    this.f47514I = 1;
                    obj = g4.a(g5, this);
                    if (obj == l4) {
                        return l4;
                    }
                } else {
                    return null;
                }
            }
            return (byte[]) obj;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super byte[]> cVar) {
            return ((g) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new g(this.f47515J, this.f47516K, cVar);
        }
    }

    private v() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(5:18|19|20|21|22))(1:24))(2:37|(2:39|40)(2:41|(2:43|(1:45)(1:46))(4:47|36|28|(5:30|(1:32)|20|21|22)(4:33|(1:35)|13|14))))|25|(3:27|28|(0)(0))|36|28|(0)(0)))|50|6|7|(0)(0)|25|(0)|36|28|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0042, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a8, code lost:
    
        com.harman.jbl.cd_biz_comm.logger.d.b(com.harman.jbl.partylight.lib.partystage.v.f47483b, "apply stage num to mainSpeaker failed " + r11 + " " + r10);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a A[Catch: Exception -> 0x0042, TRY_ENTER, TryCatch #0 {Exception -> 0x0042, blocks: (B:19:0x003d, B:20:0x00a1, B:30:0x008a), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(int r10, kotlin.coroutines.c<? super java.lang.Boolean> r11) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partylight.lib.partystage.v.c(int, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <R> java.lang.Object k(com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g<R> r7, com.harman.jbl.cd_biz_comm.wireless_tech.type.SpeakerDevice r8, kotlin.coroutines.c<? super R> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.harman.jbl.partylight.lib.partystage.v.f
            if (r0 == 0) goto L13
            r0 = r9
            com.harman.jbl.partylight.lib.partystage.v$f r0 = (com.harman.jbl.partylight.lib.partystage.v.f) r0
            int r1 = r0.f47513L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f47513L = r1
            goto L18
        L13:
            com.harman.jbl.partylight.lib.partystage.v$f r0 = new com.harman.jbl.partylight.lib.partystage.v$f
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f47511J
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f47513L
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r7 = r0.f47510I
            r8 = r7
            com.harman.jbl.cd_biz_comm.wireless_tech.type.SpeakerDevice r8 = (com.harman.jbl.cd_biz_comm.wireless_tech.type.SpeakerDevice) r8
            java.lang.Object r7 = r0.f47509H
            com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g r7 = (com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g) r7
            kotlin.W.n(r9)
            goto L52
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            kotlin.W.n(r9)
            com.harman.jbl.partylight.lib.partystage.v$g r9 = new com.harman.jbl.partylight.lib.partystage.v$g
            r9.<init>(r7, r8, r3)
            r0.f47509H = r7
            r0.f47510I = r8
            r0.f47513L = r4
            r4 = 6000(0x1770, double:2.9644E-320)
            java.lang.Object r9 = kotlinx.coroutines.w1.e(r4, r9, r0)
            if (r9 != r1) goto L52
            return r1
        L52:
            byte[] r9 = (byte[]) r9
            java.lang.String r0 = " "
            java.lang.String r1 = "StageHelper"
            if (r9 != 0) goto L78
            java.lang.String r2 = r7.e()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "write and read data failed with out connection "
            r4.append(r5)
            r4.append(r2)
            r4.append(r0)
            r4.append(r8)
            java.lang.String r2 = r4.toString()
            com.harman.jbl.cd_biz_comm.logger.d.g(r1, r2)
        L78:
            if (r9 == 0) goto L7e
            java.lang.String r3 = com.harman.jbl.cd_biz_comm.utils.i.f(r9)
        L7e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "write data to outer speaker ret "
            r2.append(r4)
            r2.append(r3)
            r2.append(r0)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            com.harman.jbl.cd_biz_comm.logger.d.a(r1, r8)
            if (r9 != 0) goto L9d
            r8 = 0
            byte[] r9 = new byte[r8]
        L9d:
            java.lang.Object r7 = r7.b(r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partylight.lib.partystage.v.k(com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g, com.harman.jbl.cd_biz_comm.wireless_tech.type.SpeakerDevice, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@l3.d kotlin.coroutines.c<? super java.lang.Boolean> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.harman.jbl.partylight.lib.partystage.v.b
            if (r0 == 0) goto L13
            r0 = r9
            com.harman.jbl.partylight.lib.partystage.v$b r0 = (com.harman.jbl.partylight.lib.partystage.v.b) r0
            int r1 = r0.f47496J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f47496J = r1
            goto L18
        L13:
            com.harman.jbl.partylight.lib.partystage.v$b r0 = new com.harman.jbl.partylight.lib.partystage.v$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f47494H
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f47496J
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.W.n(r9)
            goto L4e
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L31:
            kotlin.W.n(r9)
            com.harman.jbl.cd_biz_comm.wireless_tech.c r9 = com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G
            com.harman.jbl.partylight.lib.core.b r2 = com.harman.jbl.partylight.lib.core.b.f46256F
            com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice r2 = r2.j()
            com.harman.jbl.partylight.lib.partystage.command.f r4 = new com.harman.jbl.partylight.lib.partystage.command.f
            com.harman.jbl.partylight.lib.partystage.command.StageStatus r5 = com.harman.jbl.partylight.lib.partystage.command.StageStatus.STAGE_CANCEL
            r6 = 2
            r7 = 0
            r4.<init>(r5, r7, r6, r7)
            r0.f47496J = r3
            java.lang.Object r9 = r9.y(r2, r4, r0)
            if (r9 != r1) goto L4e
            return r1
        L4e:
            com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.WriteResp r9 = (com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.WriteResp) r9
            boolean r9 = r9.l()
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.a.a(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partylight.lib.partystage.v.d(kotlin.coroutines.c):java.lang.Object");
    }

    public final void e() {
        Iterator<T> it = com.harman.jbl.cd_biz_comm.wireless_tech.j.f38190F.r().iterator();
        while (it.hasNext()) {
            com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G.q((SpeakerDevice) it.next());
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(11:5|6|7|(1:(1:(1:(1:(1:(8:14|15|(2:30|(1:32))(1:21)|22|(1:24)|(1:26)|27|28)(2:33|34))(3:35|36|(2:38|39)(11:40|(1:42)|15|(1:17)|30|(0)|22|(0)|(0)|27|28)))(6:43|44|45|(1:47)(1:50)|48|49))(2:52|53))(1:64))(2:81|(2:83|84)(2:85|(2:87|88)(2:89|(2:91|92)(2:93|(2:95|96)(2:97|(2:99|(1:101)(1:102))(3:103|80|(2:78|79)(5:71|(3:73|(1:75)|53)|55|56|(6:58|(1:60)|45|(0)(0)|48|49)(4:61|(1:63)|36|(0)(0)))))))))|65|(5:67|(1:69)|76|78|79)|80|(0)|76|78|79))|106|6|7|(0)(0)|65|(0)|80|(0)|76|78|79) */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0059, code lost:
    
        r15 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x019b, code lost:
    
        com.harman.jbl.cd_biz_comm.logger.d.b(com.harman.jbl.partylight.lib.partystage.v.f47483b, "check enable stage failed " + r15 + " " + r14);
        r14 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x017a, code lost:
    
        if (((java.lang.Boolean) r15).booleanValue() != true) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(@l3.e java.lang.String r14, @l3.d kotlin.coroutines.c<? super java.lang.Boolean> r15) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partylight.lib.partystage.v.f(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    @l3.e
    public final com.harman.jbl.partylight.lib.d g() {
        return f47486e;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(@l3.d kotlin.coroutines.c<? super com.harman.jbl.partylight.lib.partystage.StageSaveResult> r11) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partylight.lib.partystage.v.h(kotlin.coroutines.c):java.lang.Object");
    }

    public final void i(@l3.e com.harman.jbl.partylight.lib.d dVar) {
        f47486e = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(int r7, @l3.d kotlin.coroutines.c<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.harman.jbl.partylight.lib.partystage.v.e
            if (r0 == 0) goto L13
            r0 = r8
            com.harman.jbl.partylight.lib.partystage.v$e r0 = (com.harman.jbl.partylight.lib.partystage.v.e) r0
            int r1 = r0.f47508J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f47508J = r1
            goto L18
        L13:
            com.harman.jbl.partylight.lib.partystage.v$e r0 = new com.harman.jbl.partylight.lib.partystage.v$e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f47506H
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f47508J
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.W.n(r8)
            goto L50
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            kotlin.W.n(r8)
            com.harman.jbl.cd_biz_comm.wireless_tech.c r8 = com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G
            com.harman.jbl.partylight.lib.core.b r2 = com.harman.jbl.partylight.lib.core.b.f46256F
            com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice r2 = r2.j()
            com.harman.jbl.partylight.lib.partystage.command.f r4 = new com.harman.jbl.partylight.lib.partystage.command.f
            com.harman.jbl.partylight.lib.partystage.command.StageStatus r5 = com.harman.jbl.partylight.lib.partystage.command.StageStatus.STAGE_START
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.a.f(r7)
            r4.<init>(r5, r7)
            r0.f47508J = r3
            java.lang.Object r8 = r8.y(r2, r4, r0)
            if (r8 != r1) goto L50
            return r1
        L50:
            com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.WriteResp r8 = (com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.WriteResp) r8
            boolean r7 = r8.l()
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.a.a(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partylight.lib.partystage.v.j(int, kotlin.coroutines.c):java.lang.Object");
    }
}
