package uk.co.fuuzetsu.bathroute;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.widget.TextView;

public class MyCurrentLoctionListener implements LocationListener {

private double x;;
private double y;



@Override
public void onLocationChanged(Location location) {
   x= location.getLatitude();
    y=location.getLongitude();

 

}
public double getX()
{
	return x;
}
public double getY()
{
	return y;
}

@Override
public void onProviderDisabled(String provider) {
	// TODO Auto-generated method stub
	
}

@Override
public void onProviderEnabled(String provider) {
	// TODO Auto-generated method stub
	
}

@Override
public void onStatusChanged(String provider, int status, Bundle extras) {
	// TODO Auto-generated method stub
	
}
}