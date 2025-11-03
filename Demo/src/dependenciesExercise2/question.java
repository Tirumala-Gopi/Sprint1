package dependenciesExercise2;

public class question {
//	Instructions:
//
//
//		Create the following classes:
//
//		SmartDevice
//
//		Attributes: model (String), powerUsage (double)
//		Methods: activate(), deactivate() – print simple messages.
//
//
//		Employee
//
//		Attributes: name (String), id (int)
//		Methods: useDevice(SmartDevice device) – prints a message showing the employee is using the device.
//		Association: Each employee can use multiple smart devices.
//
//
//		PowerUnit
//
//		Attributes: watts (double)
//		Methods: supplyPower() – returns watts.
//		Dependency: Devices depend on PowerUnit to operate.
//
//
//		OfficeRoom
//
//		Attributes: roomName (String), devices (ArrayList)
//		Methods: addDevice(SmartDevice device), getDevices()
//		Aggregation: Devices are added to the room but can exist independently.
//
//
//		SmartOffice
//
//		Attributes: officeName (String), rooms (ArrayList)
//		Composition: Rooms are created and managed entirely by SmartOffice. If SmartOffice is deleted, rooms should be too.
//
//
//
//
//
//		In your Runner class:
//
//		Create multiple SmartDevice objects.
//		Create Employee objects and associate them with devices.
//		Create a PowerUnit and pass it to a device to simulate power supply.
//		Create OfficeRoom objects and add devices to them.
//		Create a SmartOffice object and add rooms to it.
//		Print out the structure and interactions to verify all dependencies.
}
