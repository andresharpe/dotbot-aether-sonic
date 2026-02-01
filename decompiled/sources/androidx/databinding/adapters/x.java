package androidx.databinding.adapters;

import android.annotation.TargetApi;
import android.widget.SearchView;
import androidx.annotation.RestrictTo;
import androidx.databinding.InterfaceC0879d;

@androidx.databinding.h({@androidx.databinding.g(attribute = "android:onQueryTextFocusChange", method = "setOnQueryTextFocusChangeListener", type = SearchView.class), @androidx.databinding.g(attribute = "android:onSearchClick", method = "setOnSearchClickListener", type = SearchView.class), @androidx.databinding.g(attribute = "android:onClose", method = "setOnCloseListener", type = SearchView.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class x {

    /* loaded from: classes.dex */
    class a implements SearchView.OnQueryTextListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f14076a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f14077b;

        a(d dVar, c cVar) {
            this.f14076a = dVar;
            this.f14077b = cVar;
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextChange(String str) {
            c cVar = this.f14077b;
            if (cVar != null) {
                return cVar.onQueryTextChange(str);
            }
            return false;
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextSubmit(String str) {
            d dVar = this.f14076a;
            if (dVar != null) {
                return dVar.onQueryTextSubmit(str);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    class b implements SearchView.OnSuggestionListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f14078a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f14079b;

        b(f fVar, e eVar) {
            this.f14078a = fVar;
            this.f14079b = eVar;
        }

        @Override // android.widget.SearchView.OnSuggestionListener
        public boolean onSuggestionClick(int i4) {
            e eVar = this.f14079b;
            if (eVar != null) {
                return eVar.onSuggestionClick(i4);
            }
            return false;
        }

        @Override // android.widget.SearchView.OnSuggestionListener
        public boolean onSuggestionSelect(int i4) {
            f fVar = this.f14078a;
            if (fVar != null) {
                return fVar.onSuggestionSelect(i4);
            }
            return false;
        }
    }

    @TargetApi(11)
    /* loaded from: classes.dex */
    public interface c {
        boolean onQueryTextChange(String str);
    }

    @TargetApi(11)
    /* loaded from: classes.dex */
    public interface d {
        boolean onQueryTextSubmit(String str);
    }

    @TargetApi(11)
    /* loaded from: classes.dex */
    public interface e {
        boolean onSuggestionClick(int i4);
    }

    @TargetApi(11)
    /* loaded from: classes.dex */
    public interface f {
        boolean onSuggestionSelect(int i4);
    }

    @InterfaceC0879d(requireAll = false, value = {"android:onQueryTextSubmit", "android:onQueryTextChange"})
    public static void a(SearchView searchView, d dVar, c cVar) {
        if (dVar == null && cVar == null) {
            searchView.setOnQueryTextListener(null);
        } else {
            searchView.setOnQueryTextListener(new a(dVar, cVar));
        }
    }

    @InterfaceC0879d(requireAll = false, value = {"android:onSuggestionSelect", "android:onSuggestionClick"})
    public static void b(SearchView searchView, f fVar, e eVar) {
        if (fVar == null && eVar == null) {
            searchView.setOnSuggestionListener(null);
        } else {
            searchView.setOnSuggestionListener(new b(fVar, eVar));
        }
    }
}
