#include <iostream>
#include <string>

class greeting {
public:
	greeting() {}
	std::string getGreeting() { return m_greeting; }
private:
	std::string m_greeting = "hello, world";
};

int main(int argc, char *argv[]) {
	greeting g;
	std::cout << g.getGreeting() << std::endl;
	return 0;
}
