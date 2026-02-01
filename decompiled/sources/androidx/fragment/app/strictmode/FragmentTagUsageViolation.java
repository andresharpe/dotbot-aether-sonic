package androidx.fragment.app.strictmode;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.harman.log.b;
import kotlin.E;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

@E(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentTagUsageViolation;", "Landroidx/fragment/app/strictmode/Violation;", "Landroid/view/ViewGroup;", "F", "Landroid/view/ViewGroup;", b.f47574c, "()Landroid/view/ViewGroup;", "parentContainer", "Landroidx/fragment/app/Fragment;", "fragment", "<init>", "(Landroidx/fragment/app/Fragment;Landroid/view/ViewGroup;)V", "fragment_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class FragmentTagUsageViolation extends Violation {

    /* renamed from: F, reason: collision with root package name */
    @e
    private final ViewGroup f15344F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentTagUsageViolation(@d Fragment fragment, @e ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        F.p(fragment, "fragment");
        this.f15344F = viewGroup;
    }

    @e
    public final ViewGroup b() {
        return this.f15344F;
    }
}
