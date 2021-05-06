package spring5_autowired.di;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberListPrinter {
	private MemberPrinter printer;
	private MemberDao memberDao;
	
	
	
	public MemberListPrinter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberListPrinter(MemberPrinter printer, MemberDao memberDao) {
		super();
		this.printer = printer;
		this.memberDao = memberDao;
	}
	
	public void printAll() {
		
		Collection<Member> members = memberDao.selectAll();
		members.forEach(m->printer.print(m));
	}

	@Autowired
	public void setPrinter(MemberPrinter printer) {
		this.printer = printer;
	}

	@Autowired
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	
	
}
