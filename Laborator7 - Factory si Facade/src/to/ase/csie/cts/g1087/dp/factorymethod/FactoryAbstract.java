package to.ase.csie.cts.g1087.dp.factorymethod;

import to.ase.csie.cts.g1087.dp.simplefactory.SuperErouAbstract;
import to.ase.csie.cts.g1087.dp.simplefactory.TipErou;

public abstract class FactoryAbstract {

	public abstract SuperErouAbstract getSuperErou(TipErou tip, String nume);
}
