package com.harman.sdk.command;

import androidx.core.app.C0;
import com.harman.sdk.utils.k;
import java.util.Arrays;
import java.util.Objects;
import kotlin.E;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

@E(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/harman/sdk/command/SetPhoneMacAddressCommand;", "Lcom/harman/sdk/command/BaseCommand;", "", "hashCode", "()I", "", "o", "", "equals", "(Ljava/lang/Object;)Z", "d", "()Z", "isChangeCommand", "s", "withResponse", "", C0.f11537F0, "<init>", "([B)V", "2_hm_partybox_sdk_mgr_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SetPhoneMacAddressCommand extends BaseCommand {
    public SetPhoneMacAddressCommand(@d byte[] status) {
        F.p(status, "status");
        p(k.f48606O1);
        j(status);
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    public boolean d() {
        return true;
    }

    @Override // com.harman.sdk.command.BaseCommand
    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !F.g(SetPhoneMacAddressCommand.class, obj.getClass())) {
            return false;
        }
        SetPhoneMacAddressCommand setPhoneMacAddressCommand = (SetPhoneMacAddressCommand) obj;
        if (g() == setPhoneMacAddressCommand.g() && k() == setPhoneMacAddressCommand.k() && l() == setPhoneMacAddressCommand.l() && Arrays.equals(n(), setPhoneMacAddressCommand.n())) {
            return true;
        }
        return false;
    }

    @Override // com.harman.sdk.command.BaseCommand
    public int hashCode() {
        return Objects.hash(Byte.valueOf(g()), Byte.valueOf(k()), Integer.valueOf(l()), n());
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    public boolean s() {
        return false;
    }
}
