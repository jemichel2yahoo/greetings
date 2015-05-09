#include <iostream>
#include <fstream>
// #include <string>

int main(int argc, char *argv[]) {
	std::ofstream f;
	f.open("out");
	f << "date" << std::endl;
	f.close();
	return 0;
}
