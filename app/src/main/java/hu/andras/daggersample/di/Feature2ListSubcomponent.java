package hu.andras.daggersample.di;

import dagger.Subcomponent;
import hu.andras.daggersample.ui.feature2.list.Feature2ListActivity;

/**
 * Created by Andras Nemeth on 2017. 06. 14..
 */

@ActivityScope
@Subcomponent(modules = Feature2Module.class)
public interface Feature2ListSubcomponent {

    void inject(Feature2ListActivity feature2ListActivity);

}
