package com.harman.sdk.command;

import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.utils.MessageID;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import l3.d;

@E(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/harman/sdk/command/ReqPlayerInfoCommand;", "Lcom/harman/sdk/command/BaseCommand;", "Lcom/harman/sdk/device/HmDevice;", "device", "Lcom/harman/sdk/a;", "receivedCommand", "Lcom/harman/sdk/message/BaseMessage;", "q", "(Lcom/harman/sdk/device/HmDevice;Lcom/harman/sdk/a;)Lcom/harman/sdk/message/BaseMessage;", "", "d", "()Z", "isChangeCommand", "<init>", "()V", "L", "a", "2_hm_partybox_sdk_mgr_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ReqPlayerInfoCommand extends BaseCommand {

    /* renamed from: M, reason: collision with root package name */
    private static final int f47675M = 0;

    /* renamed from: L, reason: collision with root package name */
    @d
    public static final a f47674L = new a(null);

    /* renamed from: N, reason: collision with root package name */
    private static final int f47676N = 1;

    /* renamed from: O, reason: collision with root package name */
    private static final int f47677O = 2;

    /* renamed from: P, reason: collision with root package name */
    private static final int f47678P = 3;

    /* renamed from: Q, reason: collision with root package name */
    private static final int f47679Q = 4;

    /* renamed from: R, reason: collision with root package name */
    private static final int f47680R = 1;

    /* renamed from: S, reason: collision with root package name */
    private static final int f47681S = 7;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        public final int a() {
            return ReqPlayerInfoCommand.f47677O;
        }

        public final int b() {
            return ReqPlayerInfoCommand.f47676N;
        }

        public final int c() {
            return ReqPlayerInfoCommand.f47675M;
        }

        public final int d() {
            return ReqPlayerInfoCommand.f47679Q;
        }

        public final int e() {
            return ReqPlayerInfoCommand.f47681S;
        }

        public final int f() {
            return ReqPlayerInfoCommand.f47678P;
        }

        public final int g() {
            return ReqPlayerInfoCommand.f47680R;
        }

        private a() {
        }
    }

    public ReqPlayerInfoCommand() {
        super.p((byte) 65);
        super.v().add((byte) 66);
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    public boolean d() {
        return false;
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    @d
    public BaseMessage q(@d HmDevice device, @d com.harman.sdk.a receivedCommand) {
        F.p(device, "device");
        F.p(receivedCommand, "receivedCommand");
        BaseMessage baseMessage = new BaseMessage();
        byte[] n4 = receivedCommand.n();
        if (n4 != null) {
            if (n4.length > 2 && 66 == receivedCommand.k()) {
                v().clear();
                return u().f(device, receivedCommand, this);
            }
            baseMessage.d(MessageID.UNKNOWN);
            return baseMessage;
        }
        return baseMessage;
    }
}
