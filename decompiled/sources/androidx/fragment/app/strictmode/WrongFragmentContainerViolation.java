package androidx.fragment.app.strictmode;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.harman.log.b;
import kotlin.E;
import kotlin.jvm.internal.F;
import l3.d;

@E(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Landroidx/fragment/app/strictmode/WrongFragmentContainerViolation;", "Landroidx/fragment/app/strictmode/Violation;", "Landroid/view/ViewGroup;", "F", "Landroid/view/ViewGroup;", b.f47574c, "()Landroid/view/ViewGroup;", "container", "Landroidx/fragment/app/Fragment;", "fragment", "<init>", "(Landroidx/fragment/app/Fragment;Landroid/view/ViewGroup;)V", "fragment_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class WrongFragmentContainerViolation extends Violation {

    /* renamed from: F, reason: collision with root package name */
    @d
    private final ViewGroup f15349F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrongFragmentContainerViolation(@d Fragment fragment, @d ViewGroup container) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + container + " which is not a FragmentContainerView");
        F.p(fragment, "fragment");
        F.p(container, "container");
        this.f15349F = container;
    }

    @d
    public final ViewGroup b() {
        return this.f15349F;
    }
}
