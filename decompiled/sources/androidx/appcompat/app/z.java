package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AbstractC0583a;

/* loaded from: classes.dex */
class z implements AdapterView.OnItemSelectedListener {

    /* renamed from: E, reason: collision with root package name */
    private final AbstractC0583a.e f5012E;

    public z(AbstractC0583a.e eVar) {
        this.f5012E = eVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i4, long j4) {
        AbstractC0583a.e eVar = this.f5012E;
        if (eVar != null) {
            eVar.a(i4, j4);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
