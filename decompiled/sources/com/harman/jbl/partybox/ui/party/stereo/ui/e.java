package com.harman.jbl.partybox.ui.party.stereo.ui;

import N0.a;
import androidx.annotation.InterfaceC0561d;
import androidx.lifecycle.j0;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.message.TWSInfo;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.StatusCode;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlinx.coroutines.InterfaceC2333q;

@U({"SMAP\nStereoRenameDialogViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StereoRenameDialogViewModel.kt\ncom/harman/jbl/partybox/ui/party/stereo/ui/StereoRenameDialogViewModel\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,84:1\n314#2,11:85\n*S KotlinDebug\n*F\n+ 1 StereoRenameDialogViewModel.kt\ncom/harman/jbl/partybox/ui/party/stereo/ui/StereoRenameDialogViewModel\n*L\n44#1:85,11\n*E\n"})
/* loaded from: classes2.dex */
public final class e extends j0 {

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    public static final a f45365H = new a(null);

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private static final String f45366I = "Party.Stereo.RenameDialogViewModel";

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f45367a;

        /* renamed from: b, reason: collision with root package name */
        @l3.d
        private final String f45368b;

        public b(boolean z3, @l3.d String name) {
            F.p(name, "name");
            this.f45367a = z3;
            this.f45368b = name;
        }

        public static /* synthetic */ b d(b bVar, boolean z3, String str, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                z3 = bVar.f45367a;
            }
            if ((i4 & 2) != 0) {
                str = bVar.f45368b;
            }
            return bVar.c(z3, str);
        }

        public final boolean a() {
            return this.f45367a;
        }

        @l3.d
        public final String b() {
            return this.f45368b;
        }

        @l3.d
        public final b c(boolean z3, @l3.d String name) {
            F.p(name, "name");
            return new b(z3, name);
        }

        @l3.d
        public final String e() {
            return this.f45368b;
        }

        public boolean equals(@l3.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f45367a == bVar.f45367a && F.g(this.f45368b, bVar.f45368b);
        }

        public final boolean f() {
            return this.f45367a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z3 = this.f45367a;
            ?? r02 = z3;
            if (z3) {
                r02 = 1;
            }
            return (r02 * 31) + this.f45368b.hashCode();
        }

        @l3.d
        public String toString() {
            return "RenameResult(result=" + this.f45367a + ", name=" + this.f45368b + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.stereo.ui.StereoRenameDialogViewModel", f = "StereoRenameDialogViewModel.kt", i = {0, 0, 0, 1, 1, 1}, l = {34, 85}, m = "asyncRenameDev", n = {"this", "device", a.C0015a.f1688b, "device", a.C0015a.f1688b, "controller"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    /* loaded from: classes2.dex */
    public static final class c extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f45369H;

        /* renamed from: I, reason: collision with root package name */
        Object f45370I;

        /* renamed from: J, reason: collision with root package name */
        Object f45371J;

        /* renamed from: K, reason: collision with root package name */
        /* synthetic */ Object f45372K;

        /* renamed from: M, reason: collision with root package name */
        int f45374M;

        c(kotlin.coroutines.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f45372K = obj;
            this.f45374M |= Integer.MIN_VALUE;
            return e.this.u(null, null, this);
        }
    }

    @U({"SMAP\nStereoRenameDialogViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StereoRenameDialogViewModel.kt\ncom/harman/jbl/partybox/ui/party/stereo/ui/StereoRenameDialogViewModel$asyncRenameDev$2$listener$1\n+ 2 PartyUtils.kt\ncom/harman/jbl/partybox/ui/party/PartyUtils\n*L\n1#1,84:1\n94#2,4:85\n*S KotlinDebug\n*F\n+ 1 StereoRenameDialogViewModel.kt\ncom/harman/jbl/partybox/ui/party/stereo/ui/StereoRenameDialogViewModel$asyncRenameDev$2$listener$1\n*L\n68#1:85,4\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class d implements z2.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2333q<b> f45375a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45376b;

        /* JADX WARN: Multi-variable type inference failed */
        d(InterfaceC2333q<? super b> interfaceC2333q, String str) {
            this.f45375a = interfaceC2333q;
            this.f45376b = str;
        }

        @InterfaceC0561d
        private final void c(InterfaceC2333q<? super b> interfaceC2333q, HmDevice hmDevice, StatusCode statusCode, BaseMessage baseMessage) {
            boolean z3;
            String str;
            HmDevice hmDevice2;
            TWSInfo M3;
            if (MessageID.STEREO_GROUP_NAME == baseMessage.b()) {
                if (statusCode == StatusCode.STATUS_SUCCESS) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    Object a4 = baseMessage.a();
                    if (a4 instanceof HmDevice) {
                        hmDevice2 = (HmDevice) a4;
                    } else {
                        hmDevice2 = null;
                    }
                    if (hmDevice2 == null || (M3 = hmDevice2.M()) == null || (str = M3.b()) == null) {
                        str = this.f45376b;
                    }
                } else {
                    str = this.f45376b;
                }
                com.harman.log.f.d(e.f45366I, "asyncRenameDev.onStatusChanged() >>> success[" + z3 + "] newName[" + str + "] device:" + com.harman.jbl.partybox.ui.party.b.f44881a.t(hmDevice));
                b bVar = new b(z3, str);
                if (interfaceC2333q.c()) {
                    Result.a aVar = Result.f51807F;
                    interfaceC2333q.x(Result.b(bVar));
                    return;
                }
                return;
            }
            com.harman.log.f.a(e.f45366I, "asyncRenameDev.onStatusChanged() >>> ");
        }

        @Override // z2.d
        public void a(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            c(this.f45375a, device, code, msg);
        }

        @Override // z2.d
        public void b(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            c(this.f45375a, device, code, msg);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @l3.e
    @androidx.annotation.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(@l3.d com.harman.sdk.device.HmDevice r9, @l3.d java.lang.String r10, @l3.d kotlin.coroutines.c<? super com.harman.jbl.partybox.ui.party.stereo.ui.e.b> r11) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.party.stereo.ui.e.u(com.harman.sdk.device.HmDevice, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }
}
