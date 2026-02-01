package androidx.core.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import androidx.annotation.N;
import androidx.annotation.P;
import java.util.List;

/* loaded from: classes.dex */
public interface f extends LocationListener {
    @Override // android.location.LocationListener
    default void onFlushComplete(int i4) {
    }

    @Override // android.location.LocationListener
    default void onLocationChanged(@N List<Location> list) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            onLocationChanged(list.get(i4));
        }
    }

    @Override // android.location.LocationListener
    default void onProviderDisabled(@N String str) {
    }

    @Override // android.location.LocationListener
    default void onProviderEnabled(@N String str) {
    }

    @Override // android.location.LocationListener
    default void onStatusChanged(@N String str, int i4, @P Bundle bundle) {
    }
}
