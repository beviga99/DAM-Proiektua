package eus.uni.dam;

import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import eus.uni.dam.in.Departamento;
import eus.uni.dam.in.Estado;
import eus.uni.dam.in.Incidencia;
import eus.uni.dam.in.Login;
import eus.uni.dam.in.MysqlDao;
import eus.uni.dam.out.Departamentua;
import eus.uni.dam.out.Egoera;
import eus.uni.dam.out.Erabiltzailea;
import eus.uni.dam.out.Intzidentzia;
import eus.uni.dam.out.SqlDao;

@SpringBootApplication
public class AppBatetikBestera {

	public static void main(String[] args) {

		ApplicationContext appContextIn = new AnnotationConfigApplicationContext(DbKonfigIn.class);
		ApplicationContext appContextOut = new AnnotationConfigApplicationContext(DbKonfigOut.class);

		MysqlDao mysqldao = appContextIn.getBean(MysqlDao.class);
		SqlDao sqldao = appContextOut.getBean(SqlDao.class);
		
		List <Estado> estados = mysqldao.getAllEstado();
		List <Departamento> departamentos = mysqldao.getAllDpto();
		List <Login> langiles = mysqldao.getAllPertsona();
		List <Incidencia> incidencias = mysqldao.getAllIncidencia();
		
		for (Estado d : estados) {
			Egoera dep = new Egoera();
			dep.setId(d.getId());
			dep.setIzena(d.getNombre());
			sqldao.updateEgo(dep);
		}
		for(Departamento d : departamentos) {
			Departamentua dep = new Departamentua(d.getId(), d.getNombre());
			sqldao.updateDp(dep);
		}
		for(Login l : langiles) {
			Departamentua dep = new Departamentua(l.getDepartamento().getId(), l.getDepartamento().getNombre());
			Erabiltzailea er = new Erabiltzailea(l.getId(), l.getUsuario(), dep);
			sqldao.updateEr(er);
		}
		for(Incidencia i : incidencias) {
			Intzidentzia iz = new Intzidentzia(i.getId(), i.getContenido(), i.getEstado(), i.getPId(), i.getPersona(), i.getTitulo());
			sqldao.updateIz(iz);
		}
		
		((AnnotationConfigApplicationContext) appContextIn).close();
		((AnnotationConfigApplicationContext) appContextOut).close();
	}

}
