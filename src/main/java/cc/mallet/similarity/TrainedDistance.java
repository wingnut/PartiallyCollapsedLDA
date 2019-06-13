package cc.mallet.similarity;

import cc.mallet.types.InstanceList;

public interface TrainedDistance extends Distance {
	void init(InstanceList trainingset);
	double distanceToTrainingSample(double [] query, int sampleId);
}
