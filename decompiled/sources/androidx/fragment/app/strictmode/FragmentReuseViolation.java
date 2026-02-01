package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import com.harman.log.b;
import kotlin.E;
import kotlin.jvm.internal.F;
import l3.d;

@E(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentReuseViolation;", "Landroidx/fragment/app/strictmode/Violation;", "", "F", "Ljava/lang/String;", b.f47574c, "()Ljava/lang/String;", "previousFragmentId", "Landroidx/fragment/app/Fragment;", "fragment", "<init>", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "fragment_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class FragmentReuseViolation extends Violation {

    /* renamed from: F, reason: collision with root package name */
    @d
    private final String f15332F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentReuseViolation(@d Fragment fragment, @d String previousFragmentId) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId);
        F.p(fragment, "fragment");
        F.p(previousFragmentId, "previousFragmentId");
        this.f15332F = previousFragmentId;
    }

    @d
    public final String b() {
        return this.f15332F;
    }
}
