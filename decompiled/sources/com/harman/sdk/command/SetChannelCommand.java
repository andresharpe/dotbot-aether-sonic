package com.harman.sdk.command;

import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.utils.AudioChannel;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.k;
import kotlin.E;
import kotlin.collections.A;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.text.C2220b;
import l3.d;

@E(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\tR\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\tR\"\u0010\u0003\u001a\u00020\u00128\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/harman/sdk/command/SetChannelCommand;", "Lcom/harman/sdk/command/BaseCommand;", "Lcom/harman/sdk/utils/AudioChannel;", "channel", "Lkotlin/H0;", androidx.exifinterface.media.a.Y4, "(Lcom/harman/sdk/utils/AudioChannel;)V", "", "devIndex", "B", "(I)V", "Lcom/harman/sdk/device/HmDevice;", "device", "Lcom/harman/sdk/a;", "receivedCommand", "Lcom/harman/sdk/message/BaseMessage;", "q", "(Lcom/harman/sdk/device/HmDevice;Lcom/harman/sdk/a;)Lcom/harman/sdk/message/BaseMessage;", "", "L", "M", "channelToken", "N", "y", "()B", "z", "(B)V", "", "d", "()Z", "isChangeCommand", "<init>", "(ILcom/harman/sdk/utils/AudioChannel;)V", "2_hm_partybox_sdk_mgr_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nSetChannelCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetChannelCommand.kt\ncom/harman/sdk/command/SetChannelCommand\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"})
/* loaded from: classes2.dex */
public class SetChannelCommand extends BaseCommand {

    /* renamed from: L, reason: collision with root package name */
    private byte f47688L;

    /* renamed from: M, reason: collision with root package name */
    private final byte f47689M;

    /* renamed from: N, reason: collision with root package name */
    private byte f47690N;

    public SetChannelCommand(int i4, @d AudioChannel channel) {
        int a4;
        F.p(channel, "channel");
        a4 = C2220b.a(16);
        byte parseInt = (byte) Integer.parseInt(k.f48565B, a4);
        this.f47689M = parseInt;
        p((byte) 19);
        v().add((byte) 0);
        this.f47688L = (byte) i4;
        j(new byte[]{(byte) (i4 == -1 ? 0 : i4), parseInt, 0});
        A(channel);
    }

    private final void A(AudioChannel audioChannel) {
        if (AudioChannel.STEREO_RIGHT == audioChannel) {
            this.f47690N = (byte) 2;
        } else if (AudioChannel.STEREO_LEFT == audioChannel) {
            this.f47690N = (byte) 1;
        } else {
            this.f47690N = (byte) 0;
        }
        byte[] n4 = n();
        if (n4 != null) {
            n4[2] = this.f47690N;
        }
    }

    public final void B(int i4) {
        this.f47688L = (byte) i4;
        byte[] n4 = n();
        if (n4 != null) {
            n4[0] = this.f47688L;
        }
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
        BaseMessage baseMessage = new BaseMessage();
        if (receivedCommand.k() == 0) {
            byte[] n4 = receivedCommand.n();
            if (n4 != null && n4.length > 1 && 19 == n4[0] && n4[1] == 0) {
                A.M0(v());
                device.e0(AudioChannel.Companion.a(this.f47690N));
                baseMessage.d(MessageID.AUDIO_CHANNEL_STATUS);
                baseMessage.e(device);
            } else {
                baseMessage.d(MessageID.UNKNOWN);
            }
        } else {
            baseMessage.d(MessageID.UNKNOWN);
        }
        return baseMessage;
    }

    protected final byte y() {
        return this.f47690N;
    }

    protected final void z(byte b4) {
        this.f47690N = b4;
    }
}
