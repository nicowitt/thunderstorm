package interfaces;

import java.util.Map;

import backtype.storm.task.OutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichBolt;
import backtype.storm.tuple.Tuple;

public abstract class EventDetector extends BaseRichBolt {
	protected OutputCollector collector;

	@Override
	public void prepare(Map stormConf, TopologyContext context, OutputCollector collector){
		this.collector = collector;
	}

	@Override
	public abstract void execute(Tuple input);

	@Override
	public abstract void declareOutputFields(OutputFieldsDeclarer declarer);	
}
