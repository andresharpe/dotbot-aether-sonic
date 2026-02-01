package com.harman.sdk.command;

import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.message.OneTouchMusicButtonSettings;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.k;
import kotlin.E;
import kotlin.jvm.internal.F;
import l3.d;

@E(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u000fJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/harman/sdk/command/SetOneTouchMusicButton;", "Lcom/harman/sdk/command/BaseCommand;", "Lcom/harman/sdk/device/HmDevice;", "device", "Lcom/harman/sdk/a;", "receivedCommand", "Lcom/harman/sdk/message/BaseMessage;", "q", "(Lcom/harman/sdk/device/HmDevice;Lcom/harman/sdk/a;)Lcom/harman/sdk/message/BaseMessage;", "Lcom/harman/sdk/message/OneTouchMusicButtonSettings;", "L", "Lcom/harman/sdk/message/OneTouchMusicButtonSettings;", "y", "()Lcom/harman/sdk/message/OneTouchMusicButtonSettings;", "z", "(Lcom/harman/sdk/message/OneTouchMusicButtonSettings;)V", "oneTouchMusicButtonSettings", "", "d", "()Z", "isChangeCommand", "<init>", "2_hm_partybox_sdk_mgr_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SetOneTouchMusicButton extends BaseCommand {

    /* renamed from: L, reason: collision with root package name */
    @d
    private OneTouchMusicButtonSettings f47697L;

    public SetOneTouchMusicButton(@d OneTouchMusicButtonSettings oneTouchMusicButtonSettings) {
        F.p(oneTouchMusicButtonSettings, "oneTouchMusicButtonSettings");
        this.f47697L = oneTouchMusicButtonSettings;
        p(k.f48659e2);
        j(new byte[]{this.f47697L.a(), this.f47697L.b()});
        v().add((byte) 0);
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    public boolean d() {
        return true;
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    @d
    public BaseMessage q(@d HmDevice device, @d com.harman.sdk.a receivedCommand) {
        F.p(device, "device");
        F.p(receivedCommand, "receivedCommand");
        byte[] n4 = receivedCommand.n();
        BaseMessage baseMessage = new BaseMessage();
        if (n4 != null && n4.length >= 2 && receivedCommand.k() == 0 && n4[0] == 124) {
            if (device.D() == null) {
                device.D0(new OneTouchMusicButtonSettings());
            }
            device.D0(this.f47697L);
            v().clear();
            baseMessage.e(device.D());
            baseMessage.d(MessageID.RET_ONE_TOUCH_MUSIC_BUTTON_STATUS);
        } else {
            baseMessage.d(MessageID.UNKNOWN);
        }
        return baseMessage;
    }

    @d
    public final OneTouchMusicButtonSettings y() {
        return this.f47697L;
    }

    public final void z(@d OneTouchMusicButtonSettings oneTouchMusicButtonSettings) {
        F.p(oneTouchMusicButtonSettings, "<set-?>");
        this.f47697L = oneTouchMusicButtonSettings;
    }
}
