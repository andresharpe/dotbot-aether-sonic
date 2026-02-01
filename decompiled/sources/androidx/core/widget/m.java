package androidx.core.widget;

import android.widget.ListView;
import androidx.annotation.N;

/* loaded from: classes.dex */
public class m extends a {

    /* renamed from: m0, reason: collision with root package name */
    private final ListView f13814m0;

    public m(@N ListView listView) {
        super(listView);
        this.f13814m0 = listView;
    }

    @Override // androidx.core.widget.a
    public boolean a(int i4) {
        return false;
    }

    @Override // androidx.core.widget.a
    public boolean b(int i4) {
        ListView listView = this.f13814m0;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i5 = firstVisiblePosition + childCount;
        if (i4 > 0) {
            if (i5 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i4 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.widget.a
    public void l(int i4, int i5) {
        n.b(this.f13814m0, i5);
    }
}
