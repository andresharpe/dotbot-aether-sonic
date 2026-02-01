package androidx.viewpager2.adapter;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.N;
import androidx.core.view.C0823k0;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class a extends RecyclerView.F {
    private a(@N FrameLayout frameLayout) {
        super(frameLayout);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public static a R(@N ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(C0823k0.D());
        frameLayout.setSaveEnabled(false);
        return new a(frameLayout);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public FrameLayout S() {
        return (FrameLayout) this.f17770a;
    }
}
