#include "team_cvals.cpp"
//#include "2012Data.cpp"
#include "2013Data.cpp"
#include "2014Data.cpp"

//These are the Rank-Arrays for each team.
int RCardinals [19]= {0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int RFalcons [19]= {0, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int RRavens [19]= {0, 13, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int RBills [19]= {0, 27, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int RPanthers [19]= {0, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int RBears [19]= {0, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int RBengals [19]= {0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int RBrowns [19]= {0, 32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int RCowboys [19]= {0, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int RBroncos [19]= {0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int RLions [19]= {0, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int RPackers [19]= {0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int RTexans [19]= {0, 26, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int RColts [19]= {0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int RJaguars [19]= {0, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int RChiefs [19]= {0, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int RDolphins [19]= {0, 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int RVikings [19]= {0, 29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int RPatriots [19]= {0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int RSaints [19]= {0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int RGiants [19]= {0, 19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int RJets [19]= {0, 21, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int RRaiders [19]= {0, 31, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int REagles [19]= {0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int RSteelers [19]= {0, 17, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int RRams [19]= {0, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int RChargers [19]= {0, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int RFortyNiners [19]= {0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int RSeahawks [19]= {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int RBuccaneers [19]= {0, 23, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int RTitans [19]= {0, 25, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int RRedskins [19]= {0, 28, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

int rankarray [32][19];

//These are the home arrays for each team.
bool HCardinals []= {false, true, true, false, false, true, false, true, true, false, true, false, true, false, true, false, false, true};
bool HFalcons []= {false, true, true, false, true, true, false, true, false, false, true, false, true, false, false, true, false, true};
bool HRavens []= {false, true, true, true, false, false, true, false, false, false, true, false, true, true, true, false, true, false};
bool HBills []= {false, false, true, false, true, false, true, false, false, true, false, true, false, true, false, false, true, false};
bool HPanthers []= {false, false, false, true, false, false, false, true, false, true, false, true, false, true, false, true, true, false};
bool HBears []= {false, true, true, false, false, true, true, false, false, false, true, true, false, false, true, false, false, true};
bool HBengals []= {false, false, true, true, false, true, false, false, true, false, false, true, false, false, true, false, true, true};
bool HBrowns []= {false, false, false, false, true, true, true, false, false, true, false, false, true, true, false, true, false, false};
bool HCowboys []= {false, true, false, true, false, true, true, false, false, true, false, false, false, true, false, true, false, true};
bool HBroncos []= {false, true, false, true, true, false, true, false, true, false, false, true, false, false, true, true, false, false};
bool HLions []= {false, true, false, false, true, false, false, true, true, false, false, false, true, true, false, true, true, false};
bool HPackers []= {false, false, true, false, false, true, false, true, false, true, true, false, true, false, true, false, true, false};
bool HTexans []= {false, true, true, false, true, false, true, false, false, true, false, true, true, true, false, false, true, false};
bool HColts []= {false, false, true, false, false, true, false, true, false, false, true, false, false, true, false, true, false, true};
bool HJaguars []= {false, false, false, false, true, false, false, true, true, false, false, true, false, false, true, true, true, false};
bool HChiefs []= {false, true, true, false, true, false, true, true, true, false, false, false, true, true, false, false, true, false};
bool HDolphins []= {false, true, false, true, false, true, false, true, false, true, false, true, true, false, false, true, false, true};
bool HVikings []= {false, false, false, true, true, false, true, false, true, false, true, false, false, true, false, true, false,true};
bool HPatriots []= {false, false, true, true, false, false, true, false, true, true, false, false, true, false, true, false, false, true};
bool HSaints []= {false, false, false, true, true, false, false, false, true, false, true, true, false, false, true, false, false, true};
bool HGiants []= {false, false, true, false, false, true, false, true, false, false, true, true, true, false, false, true, false, true};
bool HJets []= {false, true, false, true, false, false, true, true, false, true, false, false, false, true, true, false, true, false};
bool HRaiders []= {false, false, true, false, true, true, false, false, true, true, false, false, true, false, false, true, false, true};
bool HEagles []= {false, true, true, true, false, false, false, true, true, false, false, true, false, true, true, false, true, false};
bool HSteelers []= {false, true, false, true, false, false, false, true, false, false, true, true, false, false, true, true, false, true};
bool HRams []= {false, true, false, false, true, true, false, false, true, true, false, false, true, false, false, true, true, false};
bool HChargers []= {false, false, false, false, true, false, true, false, false, false, true, false, false, true, true, false, true, true};
bool HFortyNiners []= {false, false, false, true, false, true, true, false, false, false, true, false, false, true, true, false, true, false};
bool HSeahawks []= {false, true, true, true, false, false, true, false, false, true, false, true, false, true, false, false, true, true};
bool HBuccaneers []= {false, true, true, false, true, false, true, false, true, false, true, true, false, false, true, true, false, false};
bool HTitans []= {false, false, false, true, true, true, false, true, false, false, true, true, false, false, false, true, false, true};
bool HRedskins []= {false, false, false, true, false, false, false, true, false, true, false, false, true, true, true, false, true, false};

bool homearray [32][19];

//These are the opponent arrays for each team.
int OCardinals []= {0, CChargers, CLions, CSaints, CBuccaneers, CPanthers, CFortyNiners, CSeahawks, CFalcons, 0,CTexans, CJaguars, CColts, CEagles, CRams, CTitans, CSeahawks, CFortyNiners};
int OFalcons []= {0, CSaints, CRams, CDolphins, CPatriots, CJets, 0, CBuccaneers, CCardinals, CPanthers, CSeahawks, CBuccaneers, CSaints, CBills, CPackers, CRedskins, CFortyNiners, CPanthers};
int ORavens []= {0, CBengals, CBrowns, CTexans, CBills, CDolphins, CPackers, CSteelers, 0, CBrowns, CBengals, CBears, CJets, CSteelers, CVikings, CLions, CPatriots, CBengals};
int OBills []= {0, CBears, CPanthers, CJets, CRavens, CBrowns, CBengals, CDolphins, CSaints, CChiefs, CSteelers, CJets, 0, CFalcons, CBuccaneers, CJaguars, CDolphins, CPatriots};
int OPanthers []= {0, CBuccaneers, CBills, CGiants, 0, CCardinals, CVikings, CRams, CBuccaneers, CFalcons, CFortyNiners, CPatriots, CDolphins, CBuccaneers, CSaints, CJets, CSaints, CFalcons};
int OBears []= {0, CBills, CVikings, CSteelers, CLions, CSaints, CGiants, CRedskins, 0, CPackers, CLions, CRavens, CRams, CVikings, CCowboys, CBrowns, CEagles, CPackers};
int OBengals []= {0, CRavens, CSteelers, CPackers, CBrowns, CPatriots, CBills, CLions, CJets, CDolphins, CRavens, CBrowns, 0, CChargers, CColts, CSteelers, CVikings, CRavens};
int OBrowns []= {0, CSteelers, CRavens, CVikings, CBengals, CBills, CLions, CPackers, CChiefs, CRavens, 0, CBengals, CSteelers, CJaguars, CPatriots, CBears, CJets, CSteelers};
int OCowboys []= {0, CFortyNiners, CChiefs, CRams, CChargers, CBroncos, CRedskins, CEagles, CLions, CVikings, CSaints, 0, CGiants, CRaiders, CBears, CPackers, CRedskins, CEagles};
int OBroncos []= {0, CColts, CGiants, CRaiders, CEagles, CCowboys, CJaguars, CColts, CRedskins, 0, CChargers, CChiefs, CPatriots, CChiefs, CTitans, CChargers, CTexans, CRaiders};
int OLions []= {0, CGiants, CCardinals, CRedskins, CBears, CPackers, CBrowns, CBengals, CCowboys, 0, CBears, CSteelers, CBuccaneers, CPackers, CEagles, CRavens, CGiants, CVikings};
int OPackers []= {0, CSeahawks, CRedskins, CBengals, 0, CLions, CRavens, CBrowns, CVikings, CBears, CEagles, CGiants, CVikings, CLions, CFalcons, CCowboys, CSteelers, CBears};
int OTexans []= {0, CRedskins, CTitans, CRavens, CSeahawks, CFortyNiners, CRams, CChiefs, 0, CColts, CCardinals, CRaiders, CJaguars, CPatriots, CJaguars, CColts, CBroncos, CTitans};
int OColts []= {0, CBroncos, CDolphins, CFortyNiners, CJaguars, CSeahawks, CChargers, CBroncos, 0, CTexans, CRams, CTitans, CCardinals, CTitans, CBengals, CTexans, CChiefs, CJaguars};
int OJaguars []= {0, CEagles, CRaiders, CSeahawks, CColts, CRams, CBroncos, CChargers, CFortyNiners, 0, CTitans, CCardinals, CTexans, CBrowns, CTexans, CBills, CTitans, CColts};
int OChiefs []= {0, CTitans, CCowboys, CEagles, CGiants, CTitans, CRaiders, CTexans, CBrowns, CBills, 0, CBroncos, CChargers, CBroncos, CRedskins, CRaiders, CColts, CChargers};
int ODolphins []= {0, CPatriots, CColts, CFalcons, CSaints, CRavens, 0, CBills, CPatriots, CBengals, CBuccaneers, CChargers, CPanthers, CJets, CSteelers, CPatriots, CBills, CJets};
int OVikings []= {0, CRams, CBears, CBrowns, CSteelers, 0, CPanthers, CGiants, CPackers, CCowboys, CRedskins, CSeahawks, CPackers, CBears, CRavens, CEagles, CBengals, CLions};
int OPatriots []= {0, CDolphins, CJets, CBuccaneers, CFalcons, CBengals, CSaints, CJets, CDolphins, CSteelers, 0, CPanthers, CBroncos, CTexans, CBrowns, CDolphins, CRavens, CBills};
int OSaints []= {0, CFalcons, CBuccaneers, CCardinals, CDolphins, CBears, CPatriots, 0, CBills, CJets, CCowboys, CFortyNiners, CFalcons, CSeahawks, CPanthers, CRams, CPanthers, CBuccaneers};
int OGiants []= {0, CLions, CBroncos, CPanthers, CChiefs, CEagles, CBears, CVikings, CEagles, 0, CRaiders, CPackers, CCowboys, CRedskins, CChargers, CSeahawks, CLions, CRedskins};
int OJets []= {0, CRaiders, CPatriots, CBills, CTitans, CFalcons, CSteelers, CPatriots, CBengals, CSaints, 0, CBills, CRavens, CDolphins, CRaiders, CPanthers, CBrowns, CDolphins};
int ORaiders []= {0, CJets, CJaguars, CBroncos, CRedskins, CChargers, CChiefs, 0, CSteelers, CEagles, CGiants, CTexans, CTitans, CCowboys, CJets, CChiefs, CChargers, CBroncos};
int OEagles []= {0, CJaguars, CChargers, CChiefs, CBroncos, CGiants, CBuccaneers, CCowboys, CGiants, CRaiders, CPackers, CRedskins, 0, CCardinals, CLions, CVikings, CBears, CCowboys};
int OSteelers []= {0, CBrowns, CBengals, CBears, CVikings, 0, CJets, CRavens, CRaiders, CPatriots, CBills, CLions, CBrowns, CRavens, CDolphins, CBengals, CPackers, CBrowns};
int ORams []= {0, CVikings, CFalcons, CCowboys, CFortyNiners, CJaguars, CTexans, CPanthers, CSeahawks, CTitans, CColts, 0, CBears, CFortyNiners, CCardinals, CSaints, CBuccaneers, CSeahawks};
int OChargers []= {0, CCardinals, CEagles, CTitans, CCowboys, CRaiders, CColts, CJaguars, 0, CRedskins, CBroncos, CDolphins, CChiefs, CBengals, CGiants, CBroncos, CRaiders, CChiefs};
int OFortyNiners []= {0, CCowboys, CSeahawks, CColts, CRams, CTexans, CCardinals, CTitans, CJaguars, 0, CPanthers, CSaints, CRedskins, CRams, CSeahawks, CBuccaneers, CFalcons, CCardinals};
int OSeahawks []= {0, CPackers, CFortyNiners, CJaguars, CTexans, CColts, CTitans, CCardinals, CRams, CBuccaneers, CFalcons, CVikings, 0, CSaints, CFortyNiners, CGiants, CCardinals, CRams};
int OBuccaneers []= {0, CPanthers, CSaints, CPatriots, CCardinals, 0, CEagles, CFalcons, CPanthers, CSeahawks, CDolphins, CFalcons, CLions, CPanthers, CBills, CFortyNiners, CRams, CSaints};
int OTitans []= {0, CChiefs, CTexans, CChargers, CJets, CChiefs, CSeahawks, CFortyNiners, 0, CRams, CJaguars, CColts, CRaiders, CColts, CBroncos, CCardinals, CJaguars, CTexans};
int ORedskins []= {0, CTexans, CPackers, CLions, CRaiders, 0, CCowboys, CBears, CBroncos, CChargers, CVikings, CEagles, CFortyNiners, CGiants, CChiefs, CFalcons, CCowboys, CGiants};

int opponentarray [32][19];