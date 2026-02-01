package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import com.harman.log.b;
import kotlin.E;
import kotlin.jvm.internal.F;
import l3.d;

@E(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Landroidx/fragment/app/strictmode/SetTargetFragmentUsageViolation;", "Landroidx/fragment/app/strictmode/TargetFragmentUsageViolation;", "Landroidx/fragment/app/Fragment;", "F", "Landroidx/fragment/app/Fragment;", "c", "()Landroidx/fragment/app/Fragment;", "targetFragment", "", "G", "I", b.f47574c, "()I", "requestCode", "fragment", "<init>", "(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;I)V", "fragment_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class SetTargetFragmentUsageViolation extends TargetFragmentUsageViolation {

    /* renamed from: F, reason: collision with root package name */
    @d
    private final Fragment f15345F;

    /* renamed from: G, reason: collision with root package name */
    private final int f15346G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetTargetFragmentUsageViolation(@d Fragment fragment, @d Fragment targetFragment, int i4) {
        super(fragment, "Attempting to set target fragment " + targetFragment + " with request code " + i4 + " for fragment " + fragment);
        F.p(fragment, "fragment");
        F.p(targetFragment, "targetFragment");
        this.f15345F = targetFragment;
        this.f15346G = i4;
    }

    public final int b() {
        return this.f15346G;
    }

    @d
    public final Fragment c() {
        return this.f15345F;
    }
}
