package org.eclipse.leshan.client.demo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.eclipse.leshan.client.resource.BaseInstanceEnabler;
import org.eclipse.leshan.core.model.ObjectModel;
import org.eclipse.leshan.core.response.ExecuteResponse;
import org.eclipse.leshan.core.response.ReadResponse;
import org.eclipse.leshan.util.NamedThreadFactory;

public class ParkingSpot extends BaseInstanceEnabler {
	
	private final ScheduledExecutorService scheduler;
	
	public ParkingSpot() {
        this.scheduler = Executors.newSingleThreadScheduledExecutor(new NamedThreadFactory("Parking Spot"));
        scheduler.scheduleAtFixedRate(new Runnable() {

            @Override
            public void run() {
                parkingspot();
            }
        }, 2, 2, TimeUnit.SECONDS);
    }
	
	public void parkingspot()
	{
		
	}

}
