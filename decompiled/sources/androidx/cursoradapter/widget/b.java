package androidx.cursoradapter.widget;

import android.database.Cursor;
import android.widget.Filter;

/* loaded from: classes.dex */
class b extends Filter {

    /* renamed from: a, reason: collision with root package name */
    a f13856a;

    /* loaded from: classes.dex */
    interface a {
        CharSequence a(Cursor cursor);

        void b(Cursor cursor);

        Cursor c();

        Cursor d(CharSequence charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(a aVar) {
        this.f13856a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f13856a.a((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor d4 = this.f13856a.d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (d4 != null) {
            filterResults.count = d4.getCount();
            filterResults.values = d4;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor c4 = this.f13856a.c();
        Object obj = filterResults.values;
        if (obj != null && obj != c4) {
            this.f13856a.b((Cursor) obj);
        }
    }
}
