package androidx.databinding.adapters;

import android.widget.SeekBar;
import androidx.annotation.RestrictTo;
import androidx.databinding.InterfaceC0879d;

@RestrictTo({RestrictTo.Scope.LIBRARY})
@androidx.databinding.q({@androidx.databinding.p(attribute = "android:progress", type = SeekBar.class)})
/* loaded from: classes.dex */
public class y {

    /* loaded from: classes.dex */
    class a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ b f14080E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ androidx.databinding.o f14081F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ c f14082G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ d f14083H;

        a(b bVar, androidx.databinding.o oVar, c cVar, d dVar) {
            this.f14080E = bVar;
            this.f14081F = oVar;
            this.f14082G = cVar;
            this.f14083H = dVar;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i4, boolean z3) {
            b bVar = this.f14080E;
            if (bVar != null) {
                bVar.onProgressChanged(seekBar, i4, z3);
            }
            androidx.databinding.o oVar = this.f14081F;
            if (oVar != null) {
                oVar.a();
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            c cVar = this.f14082G;
            if (cVar != null) {
                cVar.onStartTrackingTouch(seekBar);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            d dVar = this.f14083H;
            if (dVar != null) {
                dVar.onStopTrackingTouch(seekBar);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void onProgressChanged(SeekBar seekBar, int i4, boolean z3);
    }

    /* loaded from: classes.dex */
    public interface c {
        void onStartTrackingTouch(SeekBar seekBar);
    }

    /* loaded from: classes.dex */
    public interface d {
        void onStopTrackingTouch(SeekBar seekBar);
    }

    @InterfaceC0879d(requireAll = false, value = {"android:onStartTrackingTouch", "android:onStopTrackingTouch", "android:onProgressChanged", "android:progressAttrChanged"})
    public static void a(SeekBar seekBar, c cVar, d dVar, b bVar, androidx.databinding.o oVar) {
        if (cVar == null && dVar == null && bVar == null && oVar == null) {
            seekBar.setOnSeekBarChangeListener(null);
        } else {
            seekBar.setOnSeekBarChangeListener(new a(bVar, oVar, cVar, dVar));
        }
    }

    @InterfaceC0879d({"android:progress"})
    public static void b(SeekBar seekBar, int i4) {
        if (i4 != seekBar.getProgress()) {
            seekBar.setProgress(i4);
        }
    }
}
