package com.google.android.gms.tagmanager;

import androidx.annotation.N;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.util.D;

@D
/* loaded from: classes2.dex */
public interface ContainerHolder extends q, n {

    /* loaded from: classes2.dex */
    public interface ContainerAvailableListener {
        void onContainerAvailable(@N ContainerHolder containerHolder, @N String str);
    }

    @N
    Container getContainer();

    void refresh();

    void setContainerAvailableListener(@N ContainerAvailableListener containerAvailableListener);
}
