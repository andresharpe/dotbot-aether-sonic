package com.harman.sdk.command;

import com.harman.log.f;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.message.OneTouchMusicButtonSettings;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.k;
import kotlin.E;
import kotlin.collections.C2101p;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import l3.d;

@E(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/harman/sdk/command/ReqOneTouchMusicButton;", "Lcom/harman/sdk/command/BaseCommand;", "Lcom/harman/sdk/device/HmDevice;", "device", "Lcom/harman/sdk/a;", "receivedCommand", "Lcom/harman/sdk/message/BaseMessage;", "q", "(Lcom/harman/sdk/device/HmDevice;Lcom/harman/sdk/a;)Lcom/harman/sdk/message/BaseMessage;", "", "d", "()Z", "isChangeCommand", "<init>", "()V", "L", "a", "2_hm_partybox_sdk_mgr_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ReqOneTouchMusicButton extends BaseCommand {

    /* renamed from: L, reason: collision with root package name */
    @d
    public static final a f47672L = new a(null);

    /* renamed from: M, reason: collision with root package name */
    @d
    private static final String f47673M = "ReqOneTouchMusicButton";

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public ReqOneTouchMusicButton() {
        p(k.f48663f2);
        v().add(Byte.valueOf(k.f48667g2));
        j(null);
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    public boolean d() {
        return false;
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    @d
    public BaseMessage q(@d HmDevice device, @d com.harman.sdk.a receivedCommand) {
        Byte b4;
        F.p(device, "device");
        F.p(receivedCommand, "receivedCommand");
        byte[] n4 = receivedCommand.n();
        Byte b5 = null;
        if (n4 != null) {
            b4 = C2101p.Je(n4, 0);
        } else {
            b4 = null;
        }
        if (n4 != null) {
            b5 = C2101p.Je(n4, 1);
        }
        f.a(f47673M, "onReceive() >>> button.action[" + b4 + "] button.id[" + b5 + "]");
        BaseMessage baseMessage = new BaseMessage();
        if (n4 != null && n4.length == 2 && 126 == receivedCommand.k()) {
            if (device.D() == null) {
                device.D0(new OneTouchMusicButtonSettings());
            }
            OneTouchMusicButtonSettings D3 = device.D();
            if (D3 != null) {
                D3.c(n4[0]);
            }
            OneTouchMusicButtonSettings D4 = device.D();
            if (D4 != null) {
                D4.d(n4[1]);
            }
            v().clear();
            baseMessage.e(device.D());
            baseMessage.d(MessageID.RET_ONE_TOUCH_MUSIC_BUTTON_STATUS);
        } else {
            baseMessage.d(MessageID.UNKNOWN);
        }
        return baseMessage;
    }
}
