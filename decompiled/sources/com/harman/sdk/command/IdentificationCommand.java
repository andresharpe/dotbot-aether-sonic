package com.harman.sdk.command;

import kotlin.E;
import kotlin.jvm.internal.U;

@E(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/harman/sdk/command/IdentificationCommand;", "Lcom/harman/sdk/command/BaseCommand;", "", "devIndex", "Lkotlin/H0;", "z", "(B)V", "y", "()B", "L", "B", "", "d", "()Z", "isChangeCommand", "", "<init>", "(I)V", "2_hm_partybox_sdk_mgr_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nIdentificationCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationCommand.kt\ncom/harman/sdk/command/IdentificationCommand\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n1#2:32\n*E\n"})
/* loaded from: classes2.dex */
public final class IdentificationCommand extends BaseCommand {

    /* renamed from: L, reason: collision with root package name */
    private byte f47641L;

    public IdentificationCommand(int i4) {
        p((byte) 49);
        byte b4 = (byte) i4;
        this.f47641L = b4;
        j(new byte[]{b4});
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    public boolean d() {
        return false;
    }

    public final byte y() {
        return this.f47641L;
    }

    public final void z(byte b4) {
        this.f47641L = b4;
        byte[] n4 = n();
        if (n4 != null) {
            n4[0] = this.f47641L;
        }
    }
}
